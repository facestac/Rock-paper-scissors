package com.github.facestac;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс с методами игрового процесса
 */
public class GameProcess {
    /**
     * Количество очков, которое необходимо набрать для победы
     */
    static private int winningScore = InitGameParameters.MAX_SCORE;

    /**
     * Метод для запуска игры.
     * На выбор два режима игры:
     * 1 - быстрая игра (играют только боты, все параметры предопределены)
     * 2 - кастомный режим (задаем количество очков для победы;
     * число игроков; можно выбрать игроков (бот или юзер). После первого указания юзера -
     * все остальные игроки - боты.
     * Далее запускается игровой процесс, который длится до момента, как кто-то из игроков наберет
     * победное колиство очков (может быть больше одного игрока).
     * После завершения текущей игры, можно начать новую игру или выйти из программы.
     */
    static public void startGame() {
        Scanner sc = new Scanner(System.in);
        int playersCount = InitGameParameters.NUMBER_OF_PLAYERS;
        List<Player> players;

        do {
            int mode = selectGameMode();
            if (mode != 1) {
                winningScore = setWinningScore();
                playersCount = setNumberOfPlayers();
                players = setPlayers(playersCount, 0);
            } else { // Quick game
                players = setPlayers(playersCount, 3);
            }

            gameLoop(players);


            System.out.println("Start a new game? (y/n)");
        } while (!sc.next().matches("[nN]"));
    }

    /**
     * Игровой процесс. Для каждого раунда игры выполняем:
     * 1. Для каждого игрока выбираем фигуру (рандомно для бота или вводом с клавиатуры для юзера).
     * 2. Получаем победителей в текущем раунде.
     * 3. Добавляем очки победителям.
     * 4. Выводим информацию о текущем раунде и игроках.
     * При завершении текущей игры, выводим информацию о победителях и количество раундов.
     * @param players список игроков
     */
    static private void gameLoop(List<Player> players) {
        int round = 0;
        List<Player> winners;

        do {
            System.out.println("Round: " + ++round);

            for (Player player : players) {
                player.setShape();
            }

            winners = getWinners(players);
            if (!(winners.isEmpty() || winners.size() == players.size())) addPointsToWinners(winners);

            printRoundInfo(players, winners);

        } while (!isThereWinner(winners));

        System.out.println("GAME OVER. " + "Total rounds: " + round);
        System.out.println("Winners:");
        for (Player player: players) {
            if (player.getScore() == winningScore) System.out.println(player.getName());
        }
    }

    /**
     * Выбираем игровой режим:
     * 1 - быстрая игра
     * 2 - игра с выбором параметров
     * @return номер режима игры
     */
    static private int selectGameMode() {
        System.out.println("Select game mode:");
        System.out.println("1 - Quick game");
        System.out.println("2 - Customizable game");

        return inputCorrectInteger(1, 2);
    }

    /**
     * Для кастомного режима выбираем игроков.
     * После первого выбора юзера - остальные боты.
     * @param playersCount количество игроков
     * @param playerStatus статус игрока (1 - юзер: 2 - бот; 3 - все боты)
     * @return список игроков
     */
    static private List<Player> setPlayers(int playersCount, int playerStatus) {
        List<Player> players = new ArrayList<>();
        int playerNumber = 1;
        int botNumber = 1;

        for (int i = 0; i < playersCount; i++) {
            if (playerStatus < 3) {
                System.out.println("Enter 1 - Player; 2 - Bot; 3 - All the rest are bots.");
                playerStatus = inputCorrectInteger(1, 3);
            }

            Player player;
            if (playerStatus == 1) {
                player = new Player("Player" + playerNumber++);
                playerStatus = 3; // нет смысла в двух игороках в одной консоли
            } else player = new Bot("Bot" + botNumber++);

            players.add(player);
        }

        return players;
    }


    /**
     * Задаем число очков, которое нужно набрать для победы (кастомный режим)
     * @return число очков для победы
     */
    static private int setWinningScore() {
        System.out.println("Input the number of points to win (from 1 to 10)");

        return inputCorrectInteger(1, 10);
    }

    /**
     * Задаем количество игроков (кастомный режим)
     * @return количество игроков
     */
    static private int setNumberOfPlayers() {
        System.out.println("Input the number of players (from 2 to 3)");

        return inputCorrectInteger(2, 3);
    }

    /**
     * Метод для корректного ввода числа в нужном диапазоне
     * @param minValue минимальное згачение диапазона
     * @param maxValue максимальное згачение диапазона
     * @return введенное число
     */
    static int inputCorrectInteger(int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int inputValue;

        do {
            if (!sc.hasNextInt()) {
                System.out.println("Not an integer. Try again.");
            } else {
                inputValue = sc.nextInt();
                if (inputValue >= minValue && inputValue <= maxValue) break;
                else System.out.println("Not in range. Try again.");
            }
        } while (true);

        return inputValue;
    }

    /**
     * Метод проверки на победителей игры
     * @param players игроки
     * @return да или нет
     */
    static private boolean isThereWinner(List<Player> players) {
        for (Player player : players) {
            if (player.getScore() == winningScore) return true;
        }

        return false;
    }

    /**
     * Получаем игроков, которые выиграли текущий раунд
     * @param players список игроков
     * @return список победителей
     */
    static private List<Player> getWinners(List<Player> players) {
        int maxNumberOfBeaten = getMaxNumberOfBeaten(players);
        List<Player> winners = new ArrayList<>();

        if (maxNumberOfBeaten <= 0) {
            return winners;
        }

        for (Player player : players) {
            int numBeaten = player.getNumberOfBeaten(players);

            if (numBeaten == maxNumberOfBeaten) {
                winners.add(player);
            }
        }

        return winners;
    }

    /**
     * Добавляем очки всем победителям из списка
     * @param winners список победителей в текущем раунде
     */
    static private void addPointsToWinners(List<Player> winners) {
        for (Player winner: winners) {
            winner.addScore(1);
        }
    }

    /**
     * Выводим информацию о текущем раунде
     * @param players список игроков
     * @param winners список победителей раунда
     */
    static private void printRoundInfo(List<Player> players, List<Player> winners) {

        for (Player player : players) {
            System.out.println(player);
        }

        if (winners.isEmpty() || winners.size() == players.size()) System.out.println("DRAW");
        else {
            for (Player winner : winners) {
                System.out.println(winner.getName() + " WON; ");
            }
        }

        System.out.print("SCORE: ");
        for (Player player : players) {
            System.out.print(player.getName() + ": " +  player.getScore() + "; ");
        }

        System.out.println("\n");
    }

    /**
     * Получаем максимальное количество выбитых игроков каким-то одним игроком
     * @param players список игроков
     * @return максимум выбитых
     */
    static private int getMaxNumberOfBeaten(List<Player> players) {
        int maxNumberOfBeaten = -1;

        for (Player player : players) {
            int numBeaten = player.getNumberOfBeaten(players);

            if (numBeaten > maxNumberOfBeaten) maxNumberOfBeaten = numBeaten;
        }

        return maxNumberOfBeaten;
    }
}
