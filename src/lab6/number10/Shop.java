package lab6.number10;

import java.util.ArrayList;
import java.util.List;

class Shop {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public List<Computer> searchComputersByBrand(Brand brand) {
        List<Computer> result = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                result.add(computer);
            }
        }
        return result;
    }
}

