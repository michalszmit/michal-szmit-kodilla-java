package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING_TASK = "Driving task";
    public static final String PAINTING_TASK = "Painting task";
    public static final String SHOPPING_TASK = "Shopping task";

    public Task makeTask(final String TaskClass) {
        switch (TaskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Drive colleague", "Airport", "Audi");
            case PAINTING_TASK:
                return new PaintingTask("Paint flowers", "Red", "Roses");
            case SHOPPING_TASK:
                return new ShoppingTask("Buy present", "Gaming mouse", 1.0);
            default:
                return null;
        }
    }
}
