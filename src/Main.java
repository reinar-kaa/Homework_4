public class Main {
    public static void main(String[] args) {

        // HW_1_Task_#1 (Задание 1)
        {
            int age = 19;
            if (age >= 18) {
                System.out.println("Поздравление пользователя с совершеннолетием");
            }
        }
        {
            int age = 16;
            if (age < 18) {
                System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
            }
        }

        // HW_1_Task_#2 (Задание 2)
        {
            int childYear = 11;
            if (childYear >= 7){
                System.out.println("Ребёнок ходит в школу, если его возраст равен или больше 7 годам");
            }
        }
        {
            int teenager = 19;
            if (teenager >= 18) {
                System.out.println("Человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше");
            }
        }
        {
            int student = 26;
            if (student >= 24) {
                System.out.println("Человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет");
            }
        }

        // HW_1_Task_#3 (Задание 3)
        {
            int wagonCapacity = 102;
            int seatingPlaces = 60;
            int standingPlaces = wagonCapacity - seatingPlaces;
            System.out.println("Стоячих мест в одном вагоне рассчитано на " + standingPlaces + " человека");
            if (wagonCapacity >= 102) {
                System.out.println("Вагон уже полность забит");
            }
            if (seatingPlaces < 95) {
                System.out.println("Сидячие места имеются");
            }
            if (standingPlaces < 43) {
                System.out.println("Стоячих мест нет");
            }
        }

        // HW_2_Task_#1  (Задание 4)
        {
            int year = 20;
            if (year >= 18) {
                System.out.println("Поздравление пользователя с совершеннолетием, если ему равно или больше 18 лет");
            } else {
                System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
            }
        }
        {
            int year = 16;
            if (year <= 18) {
                System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
            } else {
                System.out.println("Поздравление пользователя с совершеннолетием, если ему равно или больше 18 лет");
            }
        }

        // HW2_Task_#2 (Задание 5)
        {
            int childYear = 10;
            if (childYear >=7 && childYear < 11) {
                System.out.println("Ребенок ходит в школу, т.к. его возраст равен или больше 7 годам");
            } else {
                System.out.println("Ребёнок еще не достиг нужного возраста");
            }
            int graduateBoyYear = 19;
            if (graduateBoyYear > 18 && graduateBoyYear < 25) {
                System.out.println("Человек уже закончил школу и может отправляться в университет, т.к его возраст 18 и больше");
            } else {
                System.out.println("Человек еще не достиг 18 лет, чтобы отправляться в университет");
            }
            int graduateStudent = 62;
            if (graduateStudent >=24 && graduateStudent < 77) {
                System.out.println("Человек окончил университет и ему пора искать первую работу, т.к. ему 24 и больше лет");
            } else {
                System.out.println("Человек не окончил универститет и ему пока рано искать первую работу, если даже ему 24 и больше лет ");
            }
        }

        // HW2_Task_#3  (Задание 6)
        {
            int wagonCapacity = 102;
            int seatingPlaces = 60;
            int standingPlaces = wagonCapacity - seatingPlaces;
            System.out.println("Стоячих мест в одном вагоне рассчитано на " + standingPlaces + " человека");
            if (wagonCapacity > 122 && wagonCapacity <= 73) {
                System.out.println("Вагон уже полность забит");
            } else {
                System.out.println("В вагоне есть свободные места");
            }
            if (seatingPlaces <= 41 && seatingPlaces > 74) {
                System.out.println("Сидячих мест нет");
            } else {
                System.out.println("Сидячие места имеются");
            }
            if (standingPlaces >= 69 && standingPlaces < 31) {
                System.out.println("Стоячих мест нет");
            } else {
                System.out.println("Стоячие места есть");
            }
        }

        // HW3_Task_#1 (Задание 7)
        {
            int man = 11; // Если не правильно понял условия задачи, то потребуется ввод переменных со значениями для других категорий возрастов, исправлю.
            String toKindergarten = "детский сад";
            String toSchool = "школу";
            String toUniversity = "университет";
            String toWork = "работу";
            boolean goToKindergarten = man >= 2 && man <=6;
            boolean goToSchool = man >=7 && man < 18;
            boolean goToUniversity = man >= 26 && man > 18;
            boolean goToWork = man > 24 && man <= 19;
            if (goToKindergarten) {
                System.out.printf("Если возраст человека равен %d, то ему нужно ходить в %s \n", man, toKindergarten);
            } else {
                System.out.printf("Если возраст человека равен %d, то ему уже не надо ходить в %s \n", man, toKindergarten);
            }
            {
            if (goToSchool) {
                    System.out.printf("Если возраст человека равен %d, то ему нужно ходить в %s \n", man, toSchool);
            } else {
                    System.out.printf("Если возраст человека равен %d, то ему уже поздно ходить в %s \n", man, toSchool);
                }
            }
            {
            if (goToUniversity) {
                    System.out.printf("Если возраст человека равен %d, то ему уже поздно ходить в %s \n", man, toUniversity);
            } else {
                    System.out.printf("Если возраст человека равен %d, то ему еще рано ходить в %s \n", man, toUniversity);
                }
            }
            {
            if (goToWork) {
                    System.out.printf("Если возраст человека равен %d, то ему нужно ходить на %s \n", man, toWork);
            } else {
                    System.out.printf("Если возраст человека равен %d, то ему еще рано ходить на %s \n", man, toWork);
                }
            }

        }

        //HW3_Task_#2 (Задание 8)
        {
            int firstChild = 4;
            int secondChild = 12;
            int thirdChild = 16;
            String canNotRide = "пока не может кататься на аттракционе";
            String canRideWithAnAdult = "может кататься в сопровождении взрослого";
            String canRideWithoutAnAdult = "может кататься без сопровождения взрослого";
            boolean first = firstChild < 5 || firstChild > 10 ;
            boolean second = secondChild >= 5 && secondChild < 14;
            boolean third = thirdChild >= 14 && thirdChild < 40 ;
            if (first) {
                System.out.printf("Если ребёнку %d лет, то он %s \n", firstChild, canNotRide);
            } else {
                System.out.printf("Если ребёнку %d лет, то он %s \n", firstChild, canRideWithAnAdult);
            }
            if (second) {
                System.out.printf("Если ребёнку %d лет, то он %s \n", secondChild,canRideWithAnAdult);
            } else {
                System.out.printf("Если ребёнку %d лет, то он %s \n", secondChild, canRideWithoutAnAdult);
            }
            if (third) {
                System.out.printf("Если ребёнку %d лет, то он %s \n", thirdChild, canRideWithoutAnAdult);
            } else {
                System.out.println();
            }

        }

        // HW3_Task_#3 (Задание 9)
        {
            int one = 1;
            int two = 2;
            int three = 3;
            if (one > two) {
                System.out.println("Первое число больше второго");
            } else {
                System.out.println("Первое число меньше второго");
            }
            if (three > two) {
                System.out.println("Третье число больше второго");
            } else {
                System.out.println("Третье число меньше второго");
            }
            if (three > two && one < two) {
                System.out.println("Третье число имеет большее значение из всех");
            } else {
                System.out.println("Третье число не имеет большее значение из всех");
            }
        }


    }
}
