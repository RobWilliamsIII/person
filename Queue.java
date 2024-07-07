import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<Person> queue;

    public Queue() {
        this.queue = new ArrayList<>();
    }

    /**
     * Adds a Person to the queue.
     */
    public void addPerson(Person person) {
        queue.add(person);
    }

    /**
     * Returns the list of Person objects in the queue.
     */
    public List<Person> getQueue() {
        return queue;
    }

    /**
     * Sort by last name in descending order using QuickSort.
     */
    public void quickSortByLastName() {
        quickSortByLastName(0, queue.size() - 1);
    }

    private void quickSortByLastName(int low, int high) {
        if (low < high) {
            int pi = partitionByLastName(low, high);

            quickSortByLastName(low, pi - 1);
            quickSortByLastName(pi + 1, high);
        }
    }

    private int partitionByLastName(int low, int high) {
        Person pivot = queue.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (queue.get(j).getLastName().compareTo(pivot.getLastName()) > 0) {
                i++;

                Person temp = queue.get(i);
                queue.set(i, queue.get(j));
                queue.set(j, temp);
            }
        }

        Person temp = queue.get(i + 1);
        queue.set(i + 1, queue.get(high));
        queue.set(high, temp);

        return i + 1;
    }

    /**
     * Sort by age in descending order using QuickSort.
     */
    public void quickSortByAge() {
        quickSortByAge(0, queue.size() - 1);
    }

    private void quickSortByAge(int low, int high) {
        if (low < high) {
            int pi = partitionByAge(low, high);

            quickSortByAge(low, pi - 1);
            quickSortByAge(pi + 1, high);
        }
    }

    private int partitionByAge(int low, int high) {
        Person pivot = queue.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (queue.get(j).getAge() > pivot.getAge()) {
                i++;

                Person temp = queue.get(i);
                queue.set(i, queue.get(j));
                queue.set(j, temp);
            }
        }

        Person temp = queue.get(i + 1);
        queue.set(i + 1, queue.get(high));
        queue.set(high, temp);

        return i + 1;
    }

    /**
     * Sort by location in descending order using QuickSort.
     */
    public void quickSortByLocation() {
        quickSortByLocation(0, queue.size() - 1);
    }

    private void quickSortByLocation(int low, int high) {
        if (low < high) {
            int pi = partitionByLocation(low, high);

            quickSortByLocation(low, pi - 1);
            quickSortByLocation(pi + 1, high);
        }
    }

    private int partitionByLocation(int low, int high) {
        Person pivot = queue.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (queue.get(j).getLocation().compareTo(pivot.getLocation()) > 0) {
                i++;

                Person temp = queue.get(i);
                queue.set(i, queue.get(j));
                queue.set(j, temp);
            }
        }

        Person temp = queue.get(i + 1);
        queue.set(i + 1, queue.get(high));
        queue.set(high, temp);

        return i + 1;
    }
}
