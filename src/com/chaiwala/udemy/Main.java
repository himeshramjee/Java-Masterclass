package com.chaiwala.udemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello command line world!");
        System.out.println();

	    /*
        PrimitivePlay pp = new PrimitivePlay();

        System.out.println();
        System.out.println("=====Sample Codings=====");
        MegaBytesAndKiloBytes sce = new MegaBytesAndKiloBytes();
        System.out.println();
        sce.printMegaBytesAndKiloBytes(1024);
        System.out.println();
        sce.printMegaBytesAndKiloBytes(2050);
        System.out.println();

        System.out.println();
        System.out.println(BarkingDog.bark(true, 1));
        System.out.println(BarkingDog.bark(false, 2));
        System.out.println(BarkingDog.bark(true, 8));
        System.out.println(BarkingDog.bark(true, -1));
        System.out.println(BarkingDog.bark(true, 23));
        System.out.println();

        System.out.println();
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2017));
        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(0));
        System.out.println(LeapYear.isLeapYear(10000));
        System.out.println(LeapYear.isLeapYear(1924));
        System.out.println();

        System.out.println();
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println();
        System.out.println(DecimalComparator.isEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(DecimalComparator.isEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(DecimalComparator.isEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println();

        System.out.println();
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));
        System.out.println();

        System.out.println();
        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 24));
        System.out.println();

        System.out.println();
        Metric2Centimeters.calcFeetAndInchesToCentimeters(1, 0);
        System.out.println();
        Metric2Centimeters.calcFeetAndInchesToCentimeters(0, 1);
        System.out.println();
        Metric2Centimeters.calcFeetAndInchesToCentimeters(1, 1);
        System.out.println();
        Metric2Centimeters.calcFeetAndInchesToCentimeters(-1, 0);
        System.out.println();
        Metric2Centimeters.calcFeetAndInchesToCentimeters(0, -1);
        System.out.println();
        Metric2Centimeters.calcFeetAndInchesToCentimeters(-1, -1);
        System.out.println();
        Metric2Centimeters.calcFeetAndInchesToCentimeters(10, 10);
        System.out.println();
        Metric2Centimeters.calcFeetAndInchesToCentimeters(12, 0);
        System.out.println();
        Metric2Centimeters.calcFeetAndInchesToCentimeters(0, 12);
        System.out.println();
        Metric2Centimeters.calcFeetAndInchesToCentimeters(1);
        System.out.println();
        Metric2Centimeters.calcFeetAndInchesToCentimeters(12);
        System.out.println();
        Metric2Centimeters.calcFeetAndInchesToCentimeters(5);
        System.out.println();
        Metric2Centimeters.calcFeetAndInchesToCentimeters(0);
        System.out.println();


        System.out.println();
        System.out.println(SecondsAndMinutes.getDurationString(0, 0));
        System.out.println(SecondsAndMinutes.getDurationString(0, 0));
        System.out.println(SecondsAndMinutes.getDurationString(0, 60));
        System.out.println(SecondsAndMinutes.getDurationString(-1, 0));
        System.out.println(SecondsAndMinutes.getDurationString(60, 60));
        System.out.println(SecondsAndMinutes.getDurationString(61, 0));
        System.out.println(SecondsAndMinutes.getDurationString(120, 0));
        System.out.println(SecondsAndMinutes.getDurationString(1800));
        System.out.println(SecondsAndMinutes.getDurationString(3600));
        System.out.println(SecondsAndMinutes.getDurationString(3600+1800+30));
        System.out.println(SecondsAndMinutes.getDurationString(0, 86400));
        System.out.println(SecondsAndMinutes.getDurationString(3945));
        System.out.println();


        System.out.println();
        System.out.println(AreaCalculator.area(0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5));
        System.out.println(AreaCalculator.area(5, 4));
        System.out.println(AreaCalculator.area(-1, 4));
        System.out.println(AreaCalculator.area(5));
        System.out.println();


        System.out.println();
        MinutesTo.printYearsAndDays(525600);
        MinutesTo.printYearsAndDays(1051200);
        MinutesTo.printYearsAndDays(561600);
        System.out.println();

        System.out.println();
        EqualityPrinter.printEqual(1, 1, 1);
        EqualityPrinter.printEqual(1, 1, 2);
        EqualityPrinter.printEqual(-1, -1, -1);
        EqualityPrinter.printEqual(1, 2, 3);
        System.out.println();

        System.out.println();
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));
        System.out.println(PlayingCat.isCatPlaying(true, 40));
        System.out.println();

        System.out.println();
        for (int i = -1; i <= 7 ; i++) {
            DayOfWeek.printDayOfTheWeek(i);
        }
        System.out.println();

        System.out.println();
        for (int i = -1; i <= 10 ; i++) {
            PrintNumber.printNumberInWord(i);
        }
        System.out.println();

        System.out.println();
        System.out.println(DaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(DaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(DaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(DaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(DaysInMonth.getDaysInMonth(1, -2020));
        System.out.println();

        System.out.println();
        Sum3And5.sum35();
        System.out.println();

        System.out.println();
        System.out.println(Odd.sumOdd(1, 100));
        System.out.println(Odd.sumOdd(-1, 100));
        System.out.println(Odd.sumOdd(100, 100));
        System.out.println(Odd.sumOdd(100, -100));
        System.out.println(Odd.sumOdd(100, 1000));
        System.out.println();

        System.out.println();
        System.out.println(DigitsSum.sumDigits(-10));
        System.out.println(DigitsSum.sumDigits(-1));
        System.out.println(DigitsSum.sumDigits(1));
        System.out.println(DigitsSum.sumDigits(10));
        System.out.println(DigitsSum.sumDigits(12));
        System.out.println(DigitsSum.sumDigits(50));
        System.out.println(DigitsSum.sumDigits(59));
        System.out.println(DigitsSum.sumDigits(101));
        System.out.println();

        System.out.println();
        System.out.println(Palindromes.isPalindrome(-112211));
        System.out.println(Palindromes.isPalindrome(10101));
        System.out.println(Palindromes.isPalindrome(707));
        System.out.println(Palindromes.isPalindrome(11223));
        System.out.println(Palindromes.isPalindrome(999999999));
        System.out.println(Palindromes.isPalindrome(000));
        System.out.println();

        System.out.println();
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-112211));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(10101));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(707));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(11223));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println();

        System.out.println();
        System.out.println(EvenDigitSum.getEvenDigitSum(-112211));
        System.out.println(EvenDigitSum.getEvenDigitSum(11223));
        System.out.println(EvenDigitSum.getEvenDigitSum(0));
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(222222222));
        System.out.println();

        System.out.println();
        System.out.println(SharedDigits.hasSharedDigit(5, 5));
        System.out.println(SharedDigits.hasSharedDigit(12, 23));
        System.out.println(SharedDigits.hasSharedDigit(12, 34));
        System.out.println(SharedDigits.hasSharedDigit(15, 55));
        System.out.println(SharedDigits.hasSharedDigit(222222222, 222222222));
        System.out.println();

        System.out.println();
        System.out.println(LastDigitCheck.hasSameLastDigit(41, 22, 71));
        System.out.println(LastDigitCheck.hasSameLastDigit(23, 32, 42));
        System.out.println(LastDigitCheck.hasSameLastDigit(9, 99, 999));
        System.out.println();

        System.out.println();
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
        System.out.println();

        System.out.println();
        Factors.printFactors(6);
        Factors.printFactors(32);
        Factors.printFactors(10);
        Factors.printFactors(-1);
        System.out.println();

        System.out.println();
        System.out.println(Perfect.isPerfectNumber(6));
        System.out.println(Perfect.isPerfectNumber(28));
        System.out.println(Perfect.isPerfectNumber(5));
        System.out.println(Perfect.isPerfectNumber(-1));
        System.out.println();

        System.out.println();
        NumberToWords.numberToWords(600);
        NumberToWords.numberToWords(281);
        NumberToWords.numberToWords(56);
        NumberToWords.numberToWords(15);
        NumberToWords.numberToWords(-1);
        NumberToWords.numberToWords(10);
        NumberToWords.numberToWords(9);
        NumberToWords.numberToWords(1234567890);
        System.out.println();

        System.out.println();
        System.out.println(FlourPacker.canPack(1, 0, 4));
        System.out.println(FlourPacker.canPack(1, 0, 5));
        System.out.println(FlourPacker.canPack(0, 5, 4));
        System.out.println(FlourPacker.canPack(2, 2, 11));
        System.out.println(FlourPacker.canPack(-3, 2, 12));
        System.out.println(FlourPacker.canPack(2, 1, 5));
        System.out.println(FlourPacker.canPack(4, 18, 19));
        System.out.println(FlourPacker.canPack(5, 3, 24));
        System.out.println();

        System.out.println();
        System.out.println("21: ");
        System.out.println("\n\tLargest Prime -> " + LargestPrime.getLargestPrime(21));
        System.out.println("217: ");
        System.out.println("\n\tLargest Prime -> " + LargestPrime.getLargestPrime(217));
        System.out.println("0: ");
        System.out.println("\n\tLargest Prime -> " + LargestPrime.getLargestPrime(0));
        System.out.println("45: ");
        System.out.println("\n\tLargest Prime -> " + LargestPrime.getLargestPrime(45));
        System.out.println("-1: ");
        System.out.println("\n\tLargest Prime -> " + LargestPrime.getLargestPrime(-1));
        System.out.println("1001: ");
        System.out.println("\n\tLargest Prime -> " + LargestPrime.getLargestPrime(1001));
        System.out.println("143: ");
        System.out.println("\n\tLargest Prime -> " + LargestPrime.getLargestPrime(143));
        System.out.println("11: ");
        System.out.println("\n\tLargest Prime -> " + LargestPrime.getLargestPrime(11));
        System.out.println();

        DiagonalStar.printSquareStar(4);
        System.out.println();
        DiagonalStar.printSquareStar(5);
        System.out.println();
        DiagonalStar.printSquareStar(8);

        System.out.println();
        ReadingUserInputChallenge.readNumbers(10);

        System.out.println();
        MinAndMaxInputChallenge.getMinMax(10);

        System.out.println();
        InputCalculator.inputThenPrintSumAndAverage();

        System.out.println();
        System.out.println("\tBuckets to buy: " + PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println();
        System.out.println("\tBuckets to buy: " + PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println();
        System.out.println("\tBuckets to buy: " + PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("--------------------------------------------");
        System.out.println("\tBuckets to buy: " + PaintJob.getBucketCount(-3.4, 2.1, 1.5));
        System.out.println();
        System.out.println("\tBuckets to buy: " + PaintJob.getBucketCount(3.4, 2.1, 1.5));
        System.out.println();
        System.out.println("\tBuckets to buy: " + PaintJob.getBucketCount(7.25, 4.3, 2.35));
        System.out.println("--------------------------------------------");
        System.out.println("\tBuckets to buy: " + PaintJob.getBucketCount(3.4, 1.5));
        System.out.println();
        System.out.println("\tBuckets to buy: " + PaintJob.getBucketCount(6.26, 2.2));
        System.out.println();
        System.out.println("\tBuckets to buy: " + PaintJob.getBucketCount(3.26, 0.75));
        System.out.println();

        System.out.println();
        SimpleCalculator sc = new SimpleCalculator();
        sc.setFirstNumber(5);
        sc.setSecondNumber(4);
        System.out.println("add= " + sc.getAdditionResult());
        System.out.println("subtract= " + sc.getSubtractionResult());
        sc.setFirstNumber(5.25);
        sc.setSecondNumber(0);
        System.out.println("multiply= " + sc.getMultiplicationResult());
        System.out.println("divide= " + sc.getDivisionResult());

        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

	    BankAccount ba = new BankAccount("Himesh Ramjee", "test@gmail.com", "0711231234");
        System.out.println("Bank account owner: " + ba.getCustomerName() + "(" + ba.getEmail() + ", " + ba.getPhoneNumber() + ")");
        System.out.println("Bank account number: " + ba.getAccountNumber());
	    ba.deposit(1000);
        System.out.println("Current balance is: " + ba.getBalance());
        ba.withdraw(700);
        System.out.println("Current balance is: " + ba.getBalance());
        ba.withdraw(300);
        System.out.println("Current balance is: " + ba.getBalance());

        VipCustomer vip = new VipCustomer();
        System.out.println("Name: " + vip.getName() + " (" + vip.getEmailAddress() + ") has a credit limit of : R" + vip.getCreditLimit());

        vip = new VipCustomer("Chaiwala", "chai@wala.co.za");
        System.out.println("Name: " + vip.getName() + " (" + vip.getEmailAddress() + ") has a credit limit of : R" + vip.getCreditLimit());

        vip = new VipCustomer("Chaiwala", 500000, "chai@wala.co.za");
        System.out.println("Name: " + vip.getName() + " (" + vip.getEmailAddress() + ") has a credit limit of : R" + vip.getCreditLimit());

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("Starting Bills Burgers Application...");
        Hamburger burger = new Hamburger(Hamburger.BreadType.Plain, 3);
        burger.addExtraTopping(HamburgerOptions.Extras.Cheese);
        burger.addExtraTopping(HamburgerOptions.Extras.Toasted);
        burger.printSummary();
        System.out.println();

        Hamburger veggieBurger = new VeggieBurger(Hamburger.BreadType.SesemeSeed, 3, VeggieBurger.PattyOption.Quorn);
        veggieBurger.addExtraTopping(HamburgerOptions.Extras.Toasted);
        veggieBurger.addExtraTopping(HamburgerOptions.Extras.Cheese);
        veggieBurger.addExtraTopping(HamburgerOptions.Extras.Lettuce);
        veggieBurger.printSummary();
        System.out.println();

        Hamburger chickenBurger = new ChickenBurger(Hamburger.BreadType.Portugese, 4, ChickenBurger.ChickenPieceOption.Breast);
        chickenBurger.addExtraTopping(HamburgerOptions.Extras.Toasted);
        chickenBurger.addExtraTopping(HamburgerOptions.Extras.Mayonaise);
        chickenBurger.addExtraTopping(HamburgerOptions.Extras.Avocado);
        chickenBurger.printSummary();
        System.out.println();

        ArraysChallenge ac = new ArraysChallenge();
        ac.printArray();
        ac.sortArray();

        int[] arrA = new int[] {1, 2, 3, 4, 5};
        ReverseArray.reverseArray(arrA);
        System.out.println();
        int[] arrB = new int[] {6, 7, 8, 9, 10, 11};
        ReverseArray.reverseArray(arrB);
        System.out.println();
        int[] arrC = new int[] {65, 71, 83, 96, 101, 121};
        ReverseArray.reverseArray(arrC);
        System.out.println();

	    MobilePhone cellphone = new MobilePhone();
        System.out.println("Count of contacts: " + cellphone.getContactsCount());

        System.out.println("Adding new contacts...");
        cellphone.addContact("Himesh Ramjee", "+27711230987");
        cellphone.addContact("Tershia Ramjee", "+27710981234");
        cellphone.addContact("Aayush Ramjee", "+27821230987");
        cellphone.addContact("Arya Ramjee", "+27820981234");
        cellphone.addContact("Gin 'o Ginner", "+27820989999");
        System.out.println("Done. Count of contacts: " + cellphone.getContactsCount());
        System.out.println();

        System.out.println("Attempting to add duplicate...");
        cellphone.addContact("Himesh Ramjee", "+27711230987");
        System.out.println();

        System.out.println("Removing contact entry...");
        cellphone.removeContact("Gin 'o Ginner");
        System.out.println();

        System.out.println("Getting contact info...");
        Contact aarya = cellphone.getContact("Arya Ramjee");
        if (aarya != null) {
            System.out.println("\tContact info: " + aarya.getFullName() + "(" + aarya.getMobileNumber() + ")");
            System.out.println("\tFixing spelling mistake for Aarya...");
            cellphone.updateContactName("Arya Ramjee", "Aarya Ramjee");
        } else {
            System.out.println("\tContact not found");
        }
        System.out.println();

        System.out.println("Updating non existent contact info...");
        cellphone.updateContactName("Yoda", "Yoda Ramjee");
        System.out.println();

        System.out.println("Updating to existing contact info (creating duplicate)...");
        cellphone.updateContactName("Yoda Ramjee", "Himesh Ramjee");
        System.out.println();

        cellphone.printContactList();
        System.out.println();

        startPlaylistApp();

	     */


    }

    private static void startPlaylistApp() {
        System.out.println("Creating songs...");
        Song s1 = new Song("Pal pal dil ke paas", 2.00);
        Song s2 = new Song("Ek Ladki Bheegi Bhaagi", 2.20);
        Song s3 = new Song("Ek mein aur ek tum", 1.30);
        Song s4 = new Song("Raat Kali Ek Khwaab", 2.00);
        Song s5 = new Song("Inteha ho gayi", 2.50);
        System.out.println();

        System.out.println("Creating albums...");
        Album a1 = new Album("Best of Kishore Kumar");
        a1.addSong(s1);
        a1.addSong(s2);
        a1.addSong(s3);
        a1.addSong(s4);
        a1.addSong(s5);

        Album a2 = new Album("Best of Asha Bhosle");
        a2.addSong(s3);
        a2.addSong(s5);

        Album a3 = new Album("Rishi Kapoor songs");
        a3.addSong(s3);

        Album a4 = new Album("Amitabh Bachchan songs");
        a4.addSong(s5);
        System.out.println();

        System.out.println("Creating playlist...");
        Playlist p1 = new Playlist("Old hindi favorites");
        System.out.println();

        System.out.println("Adding songs to playlist...");
        p1.addSong(s1);
        p1.addSong(s2);
        p1.addSong(s3);
        p1.addSong(s4);
        p1.addSong(s5);
        System.out.println();

        p1.listSongs(true);
        System.out.println();

        startMenuLoop(p1);

        System.out.println();
        System.out.println("Goodbye.");
    }

    private static void startMenuLoop(Playlist p1) {
        Scanner inputScanner = null;
        try {
            inputScanner = new Scanner(System.in);
            inputScanner.useDelimiter("\n");
            boolean exitLoop = false;
            printMenuOptions();
            while (!exitLoop) {
                int commandInput = -1;

                System.out.print("Enter a menu option number: ");
                if (inputScanner.hasNextInt()) {
                    commandInput = inputScanner.nextInt();

                    switch (commandInput) {
                        case 0:
                            printMenuOptions();
                            break;
                        case 1:
                            loadPlaylist(p1, inputScanner);
                            System.out.println();

                            System.out.println("Playlist loaded");
                            System.out.println("\tNow playing: " + p1.playSongs().getTitle() + "\n");
                            break;
                        case 2:
                            Song nextSong = p1.skipForward();
                            if (nextSong != null) {
                                System.out.println("\tNow playing: " + nextSong.getTitle() + "\n");
                            }
                            break;
                        case 3:
                            Song previousSong = p1.skipBack();
                            if (previousSong != null) {
                                System.out.println("\tNow playing: " + previousSong.getTitle() + "\n");
                            }
                            break;
                        case 4:
                            Song repeatSong = p1.repeatLastSong();
                            if (repeatSong != null) {
                                System.out.println("\tNow playing: " + repeatSong.getTitle() + "\n");
                            }
                            break;
                        default:
                            System.out.println("Stopping playlist...");
                            exitLoop = true;
                            break;
                    }
                } else {
                    String invalidInput = inputScanner.nextLine();
                    System.out.println("\t'" + invalidInput + "'" + "is not a valid menu option number. Please try again.");
                    printMenuOptions();
                    continue;
                }
            }
        }
        catch (Exception e) {
            System.out.println("Unexpected error. Stopping application. (e=" + e.toString() + ")");
        } finally {
            if (inputScanner != null) {
                inputScanner.close();
            }
        }
    }

    private static void loadPlaylist(Playlist p1, Scanner inputScanner) {
        System.out.print("Include Album info? (Yes|No) ");
        String input = inputScanner.next();
        inputScanner.nextLine();
        boolean loadAlbumInfo = (!input.isBlank() && (input.toLowerCase().equals("yes") || input.toLowerCase().equals("y"))) ? true : false;
        p1.listSongs(loadAlbumInfo);
        System.out.println();
    }

    private static void printMenuOptions() {
        System.out.println("Menu Options");
        System.out.println("\t0. Print this menu");
        System.out.println("\t1. Load playlist");
        System.out.println("\t2. Skip forward");
        System.out.println("\t3. Skip back");
        System.out.println("\t4. Repeat last song");
        System.out.println("\t5. Press any other number to exit");
    }
}