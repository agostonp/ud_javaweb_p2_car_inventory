INSERT INTO MANUFACTURER (CODE, NAME) VALUES (100, 'Audi');
INSERT INTO MANUFACTURER (CODE, NAME) VALUES (101, 'Chevrolet');
INSERT INTO MANUFACTURER (CODE, NAME) VALUES (102, 'Ford');
INSERT INTO MANUFACTURER (CODE, NAME) VALUES (103, 'BMW');
INSERT INTO MANUFACTURER (CODE, NAME) VALUES (104, 'Dodge');

INSERT INTO CAR (ID, CONDITION, BODY, EXTERNAL_COLOR, FUEL_TYPE, MILEAGE, MODEL, MODEL_YEAR, PRODUCTION_YEAR, NUMBER_OF_DOORS, MANUFACTURER_CODE, LAT, LON)
         VALUES (1001, 'NEW', 'coupee', 'White', 'petrol', 4, 'A8', '2019', '2020', 2, 100, 15, 17);
INSERT INTO CAR (ID, CONDITION, BODY, EXTERNAL_COLOR, FUEL_TYPE, MILEAGE, MODEL, MODEL_YEAR, PRODUCTION_YEAR, NUMBER_OF_DOORS, MANUFACTURER_CODE, LAT, LON)
         VALUES (1002, 'NEW', 'truck', 'Silver', 'diesel', 7, 'HILUX', '2018', '2020', 4, 104, 15, 17);
INSERT INTO CAR (ID, CONDITION, BODY, EXTERNAL_COLOR, FUEL_TYPE, MILEAGE, MODEL, MODEL_YEAR, PRODUCTION_YEAR, NUMBER_OF_DOORS, MANUFACTURER_CODE, LAT, LON)
         VALUES (1003, 'USED', 'sedan', 'Black', 'petrol', 10500, 'Astra', '2015', '2018', 5, 102, 15, 17);
