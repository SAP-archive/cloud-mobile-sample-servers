For each entity set, initial data can optionally be provided in a file *EntitySetName.json*.

Initial data is available in production and test modes.

The sample initial data below will not be automatically used, but can be copy-pasted into JSON files.

Sample initial data for file CanteenSet.json:

''' JSON
[
    {
        "CanteenID": "101",
        "Location": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Name": "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    },
    {
        "CanteenID": "102",
        "Location": "XYZ",
        "Name": "XYZ"
    }
]
'''

Sample initial data for file MenuSet.json:

''' JSON
[
    {
        "CanteenID": "101",
        "Dessert": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "MainDish": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "MenuID": "201",
        "Sides": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Soup": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Vegan": false,
        "Vegetarian": false,
        "dateOfLunch": "2019-05-22T20:50:49.646",
        "kcalForMain": 123
    },
    {
        "CanteenID": "102",
        "Dessert": null,
        "MainDish": "XYZ",
        "MenuID": "202",
        "Sides": null,
        "Soup": null,
        "Vegan": null,
        "Vegetarian": null,
        "dateOfLunch": "2019-05-22T20:50:49.646",
        "kcalForMain": null
    }
]
'''
