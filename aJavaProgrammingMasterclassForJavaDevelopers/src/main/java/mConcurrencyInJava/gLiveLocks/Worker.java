package mConcurrencyInJava.gLiveLocks;

public class Worker {

    private final String name;
    private boolean active;

    public Worker(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public synchronized void work(SharedResource sharedResource, Worker anotherWorker) {

        while(active) {
            if(sharedResource.getOwner() != this) {
                try {
                    wait(10);
                } catch(InterruptedException e) {

                }
                continue;
            }

            if(anotherWorker.isActive()) {
                System.out.println(getName() + ": give the resource to the worker " + anotherWorker.getName());
                sharedResource.setOwner(anotherWorker);
                continue;
            }
            System.out.println(getName() + " : working on the common resource");
            active = false;
            sharedResource.setOwner(anotherWorker);
        }
    }
}
