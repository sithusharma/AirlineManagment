-- Create the Flight table
CREATE TABLE public."Flight" (
    "flightID" SERIAL INT PRIMARY KEY,
    "flightID" INT NOT NULL,
    "flightNum" INT NOT NULL,
    "company" VARCHAR(255) NOT NULL,
    "departCity VARCHAR(255) NOT NULL,
    arriveCity" VARCHAR(255) NOT NULL,
    "departDate" DATE NOT NULL,
    "arriveDate" DATE NOT NULL,
    "departTime" TIME NOT NULL,
    "arriveTime" TIME NOT NULL
);

-- Create the Passenger table
CREATE TABLE "public"."Passenger" (
    "passengerID" SERIAL PRIMARY KEY,
    "firstName" VARCHAR(255) NOT NULL,
    "lastName" VARCHAR(255) NOT NULL,
);

-- Create the Booking table
CREATE TABLE "public"."Booking" (
    "bookingID" SERIAL PRIMARY KEY,
    "flightID" INT NOT NULL,
    "passengerID" INT NOT NULL,
    "bookingDate" DATE NOT NULL,
    FOREIGN KEY (flightID) REFERENCES Flight(flightID),
    FOREIGN KEY (passengerID) REFERENCES Passenger(passengerID)
);

-- Create the Airport table
CREATE TABLE "public"."Airport" (
    "airportID" SERIAL PRIMARY KEY,
    "name" VARCHAR(255) NOT NULL,
    "city" VARCHAR(255) NOT NULL,
    "country" VARCHAR(255) NOT NULL,
    "code" CHAR(3) NOT NULL
);
