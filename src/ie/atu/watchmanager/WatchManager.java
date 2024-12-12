package ie.atu.watchmanager;

public class WatchManager {

    // Create array to store Watch objects
    private Watch[] watches;

    // Constructor
    public WatchManager() {
        // Initialize array to store 10 Watch objects
        watches = new Watch[100];
    }

    // Method to add a Watch object to the array
    public void addWatch(Watch watch) {
        // Loop through array to find first empty slot
        for (int i = 0; i < watches.length; i++) {
            // Check if slot is empty
            if (watches[i] == null) {
                // Add Watch object to array
                watches[i] = watch;
                // Exit loop
                break;
            }
        }
    }

}
