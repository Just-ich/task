package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Game {

    int money = 50;
    int hp = 100;
    int force = 10;
    int energy = 70;
    int exit = 1;
    Scanner consol = new Scanner(System.in);
    SecureRandom random = new SecureRandom();


    public Game() {
        System.out.println("Игра запущена");
        System.out.println("**********Приветствую в игре!**********\n");
    }


    public void igra() {
        while (energy > 0 && money > 0 && hp > 0 && force > 0 && exit > 0) {
            System.out.println("\n############################################");
            System.out.println("Ваше здоровье: " + hp);
            System.out.println("Ваши деньги: " + money);
            System.out.println("Ваша энергия: " + energy);
            System.out.println("Ваша сила: " + force);

            System.out.println("\nВыберите следующее действие: " +
                    "\n 1 - Сражаться с монстром(1-6 энергии) " +
                    "\n 2 - Просить милостыню(2 энергии)(1-20 монет) " +
                    "\n 3 - Посетить магазин(5 энергии)" +
                    "\n 4 - Закончить игру");
            System.out.println("############################################\n");
            int move = consol.nextInt();
            switch (move) {
                case 1:
                    warMonsters();
                    break;
                case 2:
                    milostinja();
                    break;
                case 3:
                    shop();
                    break;
                case 4:
                    exit = 0;
                    break;
            }

        }
        System.out.println("\nВы закончили игру с: ");
        System.out.println("Ваше здоровье: " + hp);
        System.out.println("Ваши деньги: " + money);
        System.out.println("Ваша энергия: " + energy);
        System.out.println("Ваша сила: " + force);

    }


    // Просить милостыню
    public void milostinja() {
        int milost = random.nextInt(21);
        if (energy >= 2) {
            money += milost;
            energy -= 2;
            System.out.println("Вам пожертвовали: " + milost + " монет\n");
        } else {
            System.out.println("У вас недостаточно энергии!");
        }
    }


    //Магазин
    public void shop() {
        if (energy >= 5) {
            energy -= 5;
            System.out.println("Добро пожаловать в магазин! " +
                    "\n Что вы хотете купить?" +
                    "\n 1 - Кинжал (15 монет, +5 к силе) " +
                    "\n 2 - Кнут (20 монет, +10 к силе) " +
                    "\n 3 - Мечь (25 монет, +15 к силе)" +
                    "\n 4 - Зелье из коры дуба (36 монета, +10 к силе, -10 к энергии, +5 к здоровью) " +
                    "\n 5 - Зелье из трав (26 монета, +5 к силе, +10 к энергии, +10 к здоровью) " +
                    "\n 6 - Выйти из магазина ");

            int predmet = consol.nextInt();

            if (money >= 15) {
                switch (predmet) {

                    case 1:
                        money -= 15;
                        force += 5;
                        System.out.println("Вы купили Кинжал");
                        break;
                    case 2:
                        money -= 20;
                        force += 10;
                        System.out.println("Вы купили Кнут");
                        break;
                    case 3:
                        money -= 25;
                        force += 15;
                        System.out.println("Вы купили Мечь");
                        break;
                    case 4:
                        money -= 36;
                        force += 10;
                        energy -= 10;
                        hp += 5;
                        System.out.println("Вы купил зелье из коры дуба");
                        break;
                    case 5:
                        money -= 26;
                        force += 5;
                        energy += 10;
                        hp += 10;
                        System.out.println("Вы купили зелье из трав");
                        break;
                    case 6:
                        break;
                }
            } else {
                System.out.println("У вас недостаточно денег");
            }
        } else {
            System.out.println("У вас недостаточно энергии!");
        }


    }


    //Выбор уровня монстра
    public void warMonsters() {

        System.out.println("Выберите сложность монстра:" +
                "\n 1 - Легкий" +                          //(1-10 сила монстра)
                "\n 2 - Средний" +                         //(11 - 20 сила монстра)
                "\n 3 - Сложный" +                         //(21-40 сила монстра)
                "\n 4 - Босс" +                            //(41-50 сила монстра)
                "\n 5 - Неизвестный" +                     //(1-70 сила монстра)
                "\n 6 - Отказаться от сражения");

        int monsterType = consol.nextInt();
        switch (monsterType) {
            case 1:
                warEasyMonsters();
                break;
            case 2:
                warMidleMonsters();
                break;
            case 3:
                warStrongMonsters();
                break;
            case 4:
                warProfiMonsters();
                break;
            case 5:
                warUltimeitMonsters();
                break;
            case 6:
                break;
        }
    }


    // Лёгкий уровень монстра; отнимает 7 энергии ;
    // при победе отнимает 3 hp и добавляет: 7 монет и +2 к сила
    // при поражении отнимает 8 hp и отнимает: 4 монеты и -1 к силе
    public void warEasyMonsters() {
        if (energy >= 7) {
            energy -= 7;
            int monsterForce = random.nextInt(11);

            System.out.println("Сила монстра: " + monsterForce + "\nВаша сила: " + force);
            if (force > monsterForce) {
                hp -= 3;
                money += 7;
                force += 2;
                System.out.println("Вы победили монстра\n");

            } else if (force < monsterForce) {
                hp -= 8;
                money -= 4;
                force -= 1;
                System.out.println("Вы проиграли");
            } else if (energy < 7) {
                System.out.println("У вас недостаточно энергии!");
            }
        }
    }


    // Средний уровень монстра; отнимает 9 энергии ;
    // при победе отнимает 5 hp и добавляет: 9 монет и +3 к силе
    // при поражении отнимает 10 hp и отнимает: 6 монеты и -2 к силе

    public void warMidleMonsters() {
        if (energy >= 9) {
            energy -= 9;
            int monsterForce = random.nextInt(11) + 10;

            System.out.println("Сила монстра: " + monsterForce + "\nВаша сила: " + force);
            if (force > monsterForce) {
                hp -= 5;
                money += 9;
                force += 3;
                System.out.println("Вы победили монстра\n");

            } else if (force < monsterForce) {
                hp -= 10;
                money -= 6;
                force -= 2;
                System.out.println("Вы проиграли");
            } else if (energy < 9) {
                System.out.println("У вас недостаточно энергии!");
            }
        }
    }


    // Тяжёлый уровень монстра; отнимает 11 энергии ;
    // при победе отнимает 7 hp и добавляет: 11 монет и +4 к силе
    // при поражении отнимает 12 hp и отнимает: 8 монеты и -3 к силе
    public void warStrongMonsters() {
        if (energy >= 11) {
            energy -= 11;
            int monsterForce = random.nextInt(21) + 20;

            System.out.println("Сила монстра: " + monsterForce + "\nВаша сила: " + force);
            if (force > monsterForce) {
                hp -= 7;
                money += 11;
                force += 4;
                System.out.println("Вы победили монстра\n");

            } else if (force < monsterForce) {
                hp -= 12;
                money -= 8;
                force -= 3;
                System.out.println("Вы проиграли");
            } else if (energy < 11) {
                System.out.println("У вас недостаточно энергии!");
            }
        }
    }

    // Профи уровень монстра; отнимает 13 энергии ;
    // при победе отнимает 9 hp и добавляет: 13 монет и +5 к силе
    // при поражении отнимает 14 hp и отнимает: 10 монеты и -4 к силе

    public void warProfiMonsters() {
        if (energy >= 13) {
            energy -= 13;
            int monsterForce = random.nextInt(41) + 10;

            System.out.println("Сила монстра: " + monsterForce + "\nВаша сила: " + force);
            if (force > monsterForce) {
                hp -= 9;
                money += 13;
                force += 5;
                System.out.println("Вы победили монстра\n");

            } else if (force < monsterForce) {
                hp -= 14;
                money -= 10;
                force -= 4;
                System.out.println("Вы проиграли");
            } else if (energy < 13) {
                System.out.println("У вас недостаточно энергии!");
            }
        }
    }

    // Ytbpdtcnysq монстра; отнимает 15 энергии ;
    // при победе отнимает 11 hp и добавляет: 15 монет и +7 к силе
    // при поражении отнимает 16 hp и отнимает: 12 монеты и -6 к силе
    public void warUltimeitMonsters() {
        if (energy >= 15) {
            int monsterForce = random.nextInt(61) + 10;
            energy -= 15;
            System.out.println("Сила монстра: " + monsterForce + "\nВаша сила: " + force);
            if (force > monsterForce) {
                hp -= 11;
                money += 15;
                force += 7;
                System.out.println("Вы победили монстра\n");

            } else if (force < monsterForce) {
                hp -= 16;
                money -= 12;
                force -= 6;
                System.out.println("Вы проиграли");
            } else if (energy < 5) {
                System.out.println("У вас недостаточно энергии!");
            }
        }
    }


}
