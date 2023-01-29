import java.util.InputMismatchException;
import java.util.Scanner;

interface credential {
    void name();
    void email();
}

interface instruction {
    void inst ();
}

interface question {
    void first ();
    void second ();
    void third ();
    void fourth();
    void fifth ();
}

interface feedback {
    void rating ();
    void welcome ();
    void nota ();
}

class score {
    int positive, countPositive = 0;
    int negetive, countNegetive = 0;
    int total = 0;
    public void setPositive(int positive) {
        this.positive = positive;
        countPositive+=positive;
    }
    public void setNegetive(int negetive) {
        this.negetive = negetive;
        countNegetive += negetive;
    }
    public int getTotal() {
        total += (countPositive - countNegetive);
        System.out.println("Your Total Score is: " + total);
        return total;
    }
}
 class firstTest extends score implements instruction, credential, question, feedback{
    public void name () {
        System.out.println("Enter your name: ");
    }
    public void email () {
        System.out.println("Enter your e-mail: ");
    }
    public void inst () {
        System.out.println("****** Welcome to our online test ********\n1. Only press the serial number of correct option for each question\n2. For each correct answer you will" +
                "get 2 marks and for wrong answer 1 mark will be deducted\n3. If yu do not enter any integer, then you will be disqualified immediately\n\n");
    }
    public void first () {
        System.out.println("\nA. What is the capital of India?\n1. New Delhi\n2. Kolkata\n3. Islamabad\n4. Chennai");
        System.out.println("\nEnter your choice: ");
    }
    public void second () {
        System.out.println("\n\nB. What is the capital of West Bengal?\n1. Kolkata\n2. Simla\n2. Manali\n3. Araballi");
        System.out.println("\nEnter your choice: ");
    }
    public void third () {
        System.out.println("\n\nC. Who is prime minister of India?\n1. Mamata Banerjee\n2. Nabin Pattanayek\n3. Narendra Modi\n4. Mahatma Gandhi");
        System.out.println("\nEnter your choice: ");
     }
     public void fourth () {
         System.out.println("\n\nD. Who was the first prime minister of india?\n1. Ballavbhai Patel\n2. Mahatma Gandhi\n3. Chandrababau Naidu\n4. Jaharlal Neheru");
         System.out.println("\nEnter your choice: ");
     }
     public void fifth () {
         System.out.println("\n\nE. According to area, which is the largest state of India?\n1. West Bengal\n2. Maharashtra\n3. Rajasthan\n4. Karnataka");
         System.out.println("\nEnter your choice: ");
     }
     public void rating () {
         System.out.println("\n\nPlese provide feedbaack by rating us between 1 and 10\nEnter your rating: ");
     }
     public void welcome () {
         System.out.println("Thank you for your valuable feedback\nPlease visit again");
     }
     public void nota () {
         System.out.println("Thank you");
     }
 }

class myException1 extends Exception{
    public String getMessage () {
        return "Oops!! Wrong answer";
    }
}

class myException2 extends Exception{
    public String getMessage () {
        return "Please enter a valid command";
    }
}

class myException3 extends Exception {
    public String getMessage () {
        return "Please enter a valid option";
    }
}


public class QuizApp {
    public static void main(String[] args) {
        firstTest t = new firstTest();
        Scanner sc = new Scanner(System.in);
        t.name();
        String name = sc.nextLine();
        t.email();
        String email = sc.nextLine();
        System.out.println("Welcome " + name + ", your registered E-mail ID is: " + email + "\n\n");

        t.inst();

        System.out.println("If you want to play the quiz please press 1, other wise press 0");
        try {
            try {
                int pref = sc.nextInt();
                if (pref == 1) {
                    t.first();
                    try {
                        int a = sc.nextInt();
                        if (a == 1) {
                            System.out.println("Congratulations!! Correct answer");
                            t.setPositive(2);
                        } else if (a == 2 || a == 3 || a == 4) {
                            try {
                                t.setNegetive(1);
                                throw new myException1();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                e.getMessage();
                            }
                        } else {
                            try {
                                throw new myException2();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                e.getMessage();
                            }
                        }

                        t.second();
                        try {
                            int b = sc.nextInt();
                            if (b == 1) {
                                System.out.println("Congratulations!! Correct answer");
                                t.setPositive(2);
                            } else if (b == 2 || b == 3 || b == 4) {
                                try {
                                    t.setNegetive(1);
                                    throw new myException1();
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                    e.getMessage();
                                }
                            } else {
                                try {
                                    throw new myException2();
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                    e.getMessage();
                                }
                            }

                            t.third();
                            try {
                                int c = sc.nextInt();
                                if (c == 3) {
                                    System.out.println("Congratulations!! Correct answer");
                                    t.setPositive(2);
                                } else if (c == 2 || c == 1 || c == 4) {
                                    try {
                                        t.setNegetive(1);
                                        throw new myException1();
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                        e.getMessage();
                                    }
                                } else {
                                    try {
                                        throw new myException2();
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                        e.getMessage();
                                    }
                                }

                                t.fourth();
                                try {
                                    int d = sc.nextInt();
                                    if (d == 4) {
                                        System.out.println("Congratulations!! Correct answer");
                                        t.setPositive(2);
                                    } else if (d == 2 || d == 3 || d == 1) {
                                        try {
                                            t.setNegetive(1);
                                            throw new myException1();
                                        } catch (Exception e) {
                                            System.out.println(e.getMessage());
                                            e.getMessage();
                                        }
                                    } else {
                                        try {
                                            throw new myException2();
                                        } catch (Exception e) {
                                            System.out.println(e.getMessage());
                                            e.getMessage();
                                        }
                                    }

                                    t.fifth();
                                    try {
                                        int f = sc.nextInt();
                                        if (f == 3) {
                                            System.out.println("Congratulations!! Correct answer");
                                            t.setPositive(2);
                                        } else if (f == 2 || f == 1 || f == 4) {
                                            try {
                                                t.setNegetive(1);
                                                throw new myException1();
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                                e.getMessage();
                                            }
                                        } else {
                                            try {
                                                throw new myException2();
                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                                e.getMessage();
                                            }
                                        }

                                        System.out.println("\n\nThe quize has been ended\nHope you have enjoyed our quize\n\n");
                                        t.getTotal();

                                        t.rating();
                                        int ch = sc.nextInt();
                                        t.welcome();
                                    } catch (InputMismatchException msg) {
                                        System.out.println("Input Mismatch Exception has occured\nYou are disqualified");
                                        System.out.println("\n\nThe quize has been ended\nHope you have enjoyed our quize\n\n");
                                        t.getTotal();
                                    }
                                } catch (InputMismatchException msg) {
                                    System.out.println("Input Mismatch Exception has occured\nYou are disqualified");
                                    System.out.println("\n\nThe quize has been ended\nHope you have enjoyed our quize\n\n");
                                    t.getTotal();
                                }
                            } catch (InputMismatchException msg) {
                                System.out.println("Input Mismatch Exception has occured\nYou are disqualified");
                                System.out.println("\n\nThe quize has been ended\nHope you have enjoyed our quize\n\n");
                                t.getTotal();
                            }
                        } catch (InputMismatchException msg) {
                            System.out.println("Input Mismatch Exception has occured\nYou are disqualified");
                            System.out.println("\n\nThe quize has been ended\nHope you have enjoyed our quize\n\n");
                            t.getTotal();
                        }
                    } catch (InputMismatchException msg) {
                        System.out.println("Input Mismatch Exception has occured\nYou are disqualified");
                        System.out.println("\n\nThe quize has been ended\nHope you have enjoyed our quize\n\n");
                        t.getTotal();
                    }
                } else if (pref == 0) {
                    t.nota();
                } else {
                    System.out.println("Please enter a valid option");
                }
            } catch (Exception e) {
                System.out.println("Entered value is not an integer\nThank you");
            }
        }
            catch (InputMismatchException msg) {
                System.out.println("Entered value is not an integer\nThank You");
            }
    }
}
