For each entity set, initial data can optionally be provided in a file *EntitySetName.json*.

Initial data is available in production and test modes.

The sample initial data below will not be automatically used, but can be copy-pasted into JSON files.

Sample initial data for file AirportSet.json:

''' JSON
[
    {
        "AirportID": "101",
        "iataCode": "ABCDEF",
        "latitude": "12345678.12",
        "longitude": "12345678.12",
        "name": "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    },
    {
        "AirportID": "102",
        "iataCode": "XYZ",
        "latitude": "98765432.98",
        "longitude": "98765432.98",
        "name": "XYZ"
    }
]
'''

Sample initial data for file FlightSet.json:

''' JSON
[
    {
        "FlightID": "201",
        "aircraftReg": "ABCDEFGHIJ",
        "aircraftType": "ABCDEFGHIJ",
        "arrival": "2019-05-31T18:15:37.074",
        "code": "ABCDEFGHIJ",
        "departure": "2019-05-31T18:15:37.074",
        "duration": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "fromAirportID": "101",
        "remarks": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "toAirportID": "101"
    },
    {
        "FlightID": "202",
        "aircraftReg": "XYZ",
        "aircraftType": "XYZ",
        "arrival": "2019-05-31T18:15:37.074",
        "code": "XYZ",
        "departure": "2019-05-31T18:15:37.074",
        "duration": "XYZ",
        "fromAirportID": "102",
        "remarks": null,
        "toAirportID": "102"
    }
]
'''
