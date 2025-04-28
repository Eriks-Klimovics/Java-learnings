package lv.acodemy;

public class PezDispenser {

    private String name;
    private String color;
    private String seriesNumber;
    private int maxCapacity;
    private int currentCandyCount;

    public PezDispenser(String name, String color, String seriesNumber, int maxCapacity) {
        this.name = name;
        this.color = color;
        this.seriesNumber = seriesNumber;
        this.maxCapacity = maxCapacity;
        this.currentCandyCount = 0; // dispenser is empty

    }
    // Dispenser give one candy
    public void dispenseOne() {
        if (currentCandyCount > 0) {
            currentCandyCount --;
            System.out.println(" One candy given out. Candies left: " + currentCandyCount);
        } else {
            System.out.println(" No candy to give out!");
        }
    }

    // Dispenser will give out several candies
    public void dispenseMultiple(int count) {
        if (count <= 0) {
            System.out.println(" Incorrect quantity to issue");
        } else if (currentCandyCount >= count) {
            currentCandyCount -= count;
            System.out.println(" Issued" + count + " candies. Candies left: " + currentCandyCount);
        } else {
            System.out.println(" Not enough candy! Only left: " + currentCandyCount);
        }
    }


    // Dispenser to the maximum
    public void refillToMax() {
        int added = maxCapacity - currentCandyCount;
        if (added > 0) {
            currentCandyCount = maxCapacity;
            System.out.println("Loaded more " + added + " candies. Now fully loaded: " + currentCandyCount);
        } else {
            System.out.println("Dispenser is full!");
        }
    }

    // Load one candy into the dispenser
    public void addOneCandy() {
        if (currentCandyCount < maxCapacity) {
            currentCandyCount++;
            System.out.println("One candy added. Now candies:  " + currentCandyCount);
        } else {
            System.out.println(" Can't add more candies, dispenser is full!");
        }
    }
    // load some candy into the dispenser

    public void addMultipleCandies(int count) {
        if (count <= 0) {
            System.out.println(" Incorrect quantity to add");
        } else if (currentCandyCount + count <= maxCapacity) {
            currentCandyCount += count;
            System.out.println("Added " + count + " candies. Now candies: " + currentCandyCount);
        } else {
            System.out.println("Cannot be added " + count + " candies  overflow! There's still room for: " + (maxCapacity - currentCandyCount) + " candies");
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSeriesNumber() {
        return seriesNumber;
    }

    public int getCurrentCandyCount() {
        return currentCandyCount;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
