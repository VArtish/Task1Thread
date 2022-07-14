package com.azati.task1.main;

import com.azati.task1.creator.RandomShipCreator;
import com.azati.task1.entity.Ship;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        RandomShipCreator shipCreator = RandomShipCreator.getInstance();
        List<Ship> ships = shipCreator.createShips();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (Ship ship : ships) {
            executorService.execute(ship);
        }
        executorService.shutdown();
    }
}
