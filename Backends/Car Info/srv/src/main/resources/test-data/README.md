For each entity set, test data can optionally be provided in a file *EntitySetName.json*.

Test data is available only in "test mode", not in production mode.

Please refer to the generated TestSettings class to see the options for enabling test mode.

Sample test data for file ReadingSet.json:

''' JSON
[
    {
        "ReadingID": "101",
        "VehicleID": "201",
        "fillCost": "12.12",
        "fillDate": "2019-05-22T20:29:10.587",
        "fillFuel": "12.12",
        "odometer": "12345678.12"
    },
    {
        "ReadingID": "102",
        "VehicleID": "202",
        "fillCost": "98.98",
        "fillDate": "2019-05-22T20:29:10.587",
        "fillFuel": "98.98",
        "odometer": "98765432.98"
    }
]
'''

Sample test data for file VehicleSet.json:

''' JSON
[
    {
        "VehicleID": "201",
        "description": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "reg": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "startDate": "2019-05-22T20:29:10.587",
        "startOdo": "12345678.12"
    },
    {
        "VehicleID": "202",
        "description": "XYZ",
        "reg": "XYZ",
        "startDate": "2019-05-22T20:29:10.587",
        "startOdo": "98765432.98"
    }
]
'''
