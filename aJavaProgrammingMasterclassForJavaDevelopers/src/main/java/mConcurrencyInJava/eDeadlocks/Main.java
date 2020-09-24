package mConcurrencyInJava.eDeadlocks;

public class Main {

    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        final PolitePerson jane = new PolitePerson("Jane");
        final PolitePerson john = new PolitePerson("John");

        new Thread(new Runnable() {
            @Override
            public void run() {
                jane.sayHello(john);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                john.sayHello(jane);
            }
        }).start();
        /*
        new Thread1().start();
        new Thread2().start();
        */
    }

    static class PolitePerson {
        private final String name;

        public PolitePerson(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void sayHello(PolitePerson person) {
            System.out.format("%s: %s" + " has said hello to me!%n", this.name, person.getName());
            person.sayHelloBack(this);
        }

        public synchronized void sayHelloBack(PolitePerson person) {
            System.out.format("%s: %s" + " has said hello back to me!%n", this.name, person.getName());
        }
    }

    private static class Thread1 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread1: Has lock1");
                try {
                    Thread.sleep(100);
                } catch(InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Thread1: Waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread1: Has lock1 and lock2");
                }
                System.out.println("Thread1: Released lock2");
            }
            System.out.println("Thread1: Released lock1. Exiting...");
        }
    }

    private static class Thread2 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread2: Has lock1");
                try {
                    Thread.sleep(100);
                } catch(InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Thread2: Waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread2: Has lock1 and lock2");
                }
                System.out.println("Thread2: Released lock2");
            }
            System.out.println("Thread2: Released lock1. Exiting...");
        }
    }
}


