# parkinglot

# Parking Lot System - Low-Level Design

This document provides an overview of the low-level design for a parking lot system implemented in Java. The parking lot system is responsible for managing vehicle entry, exit, and parking space allocation. This design focuses on the internal components and classes that make up the system.

## Table of Contents

1. [Introduction](#introduction)
  
2. [Class Diagram](#class-diagram)
  
3. [Classes and Responsibilities](#classes-and-responsibilities)

4. [Key Components](#key-components)
  
5. [Usage](#usage)

6. [Future Improvements](#future-improvements)

7. [Conclusion](#conclusion)

## 1. Introduction

The parking lot system is designed to efficiently manage vehicle parking within a parking lot. It keeps track of available parking spaces, allocates spaces to vehicles, and handles entry and exit procedures.

## 2. Class Diagram

```
                        +-----------+
                        |  Vehicle  |
                        +-----------+
                              |
           +------------------+------------------+
           |                                     |
  +-----------------+                 +------------------+
  |    Car          |                 |    ParkingLot    |
  +-----------------+                 +------------------+
                              |
                    +---------------------+
                    |        Slot         |
                    +---------------------+
```

## 3. Classes and Responsibilities

- `Vehicle`: Represents a generic vehicle. Subclasses like `Car` can be derived from this with specific attributes.

- `Car`: A specific type of vehicle with additional attributes as required.

- `ParkingLot`: Manages the parking lot and available spaces. It keeps track of occupied and vacant parking spaces.

- `Slot`: Represents an individual parking space. It holds information about its status (occupied or vacant) and location.

## 4. Key Components

### ParkingLot

- `List<Slot> slots`: A list of parking spaces in the parking lot.
- 'List<Floor> floors': A list of parking floors in the parking lot.


### Vehicle

- `String VehicleNo`: License plate number of the vehicle.
- Other attributes and methods specific to vehicle types (e.g., Car,Bicycle) can be added here.

### ParkingSpace

- `int SlotId`: Unique identifier for the parking space.
- `enum filled`: Indicates if the parking space is occupied or vacant.

## 5. Usage

Here's a brief overview of how the parking lot system can be used:

1. Create a `ParkingLot` instance with a specific capacity.
2. Initialize parking spaces using `initializeParkingSpaces()`.
3. Vehicles can be created using specific subclasses like `Car`.
4.Generate a ticket to get the slot.

## 6. Future Improvements

- Integration with payment systems for paid parking.
- Implementation of reservation system for specific parking spots.
- Real-time monitoring and reporting of parking lot occupancy.

## 7. Conclusion

This low-level design provides a foundation for building a parking lot system in Java. It offers flexibility for adding more features and enhancements while efficiently managing vehicle parking within the parking lot.
