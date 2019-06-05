For each entity set, initial data can optionally be provided in a file *EntitySetName.json*.

Initial data is available in production and test modes.

The sample initial data below will not be automatically used, but can be copy-pasted into JSON files.

Sample initial data for file ReadingSet.json:

''' JSON
[
    {
        "ReadingID": "101",
        "VehicleID": "201",
        "fillCost": "12.12",
        "fillDate": "2019-05-22T20:29:10.586",
        "fillFuel": "12.12",
        "odometer": "12345678.12"
    },
    {
        "ReadingID": "102",
        "VehicleID": "202",
        "fillCost": "98.98",
        "fillDate": "2019-05-22T20:29:10.586",
        "fillFuel": "98.98",
        "odometer": "98765432.98"
    }
]
'''

Sample initial data for file VehicleSet.json:

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
