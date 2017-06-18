Business logic implementation.

Separate business logic and user interface
(they must be in different methods:
business-logic method should not contain any I/O operation)

• Declare structs for flight information, flights pricelist and passage list views

• Represent data as arrays (simple types and structures)

• Business-logic methods:

view arrivals,
view departures,
view flight pricelist,
view passengers list,
search flight number,
search first and second name.


 Methods should take parameters
 (data for manipulations and return results;
  for example, search flight number must return flight with input number)

  • Implement interface methods for every business-logic method
  • All functionality could be implemented in different methods
  • Develop simple menu as different interface methods
  • Develop simple parts of functionality using arrays, casting and type
  conversions, loops, switch, read/write from/to console, string format

  view of the airline flight information about arrivals and departures (separately).
  It should reflect the information about the

  arrival (departure) date and time,
  flight number,
  city/port of arrival (departure),
  terminal,
  flight status (
        check-in,
        gate closed,
        arrived,
        departed at,
        unknown,
        canceled,
        expected at,
        delayed,
        in flight),
  gate

  • view of the flights pricelist with the class prices

  • view of the passengers list. It should reflect the information
   about the

    flight number,
    passenger first name,
    second name,
    nationality,
    passport,
    date of birthday,
    sex,
    class (business, economy).

     Only for company staff

  • insert, delete and update of this information.
    Only for company staff
  • search by the flight number, price, first and second name, passport, arrival
  (departure) port of and information output in the specified format.
   Clients information is only for company staff