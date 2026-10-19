import random

def cab_booking_chatbot():

    while True:
        print("\n===== CAB BOOKING CHATBOT =====")
        print("1. Book Ride")
        print("2. Exit")

        choice = input("Enter your choice: ").strip()

        if choice == "1":

            print("\n===== SELECT CAB TYPE =====")
            print("1. Auto - Rs.12/km")
            print("2. Sedan - Rs.18/km")
            print("3. SUV - Rs.25/km")

            cab_choice = input("Enter cab choice: ").strip()

            cabs = {
                "1": ("Auto", 12),
                "2": ("Sedan", 18),
                "3": ("SUV", 25)
            }

            if cab_choice not in cabs:
                print("Invalid cab choice!")
                continue

            cab_type, rate = cabs[cab_choice]

            print("\n===== SELECT ROUTE =====")
            print("1. Pune Station to Shivajinagar - 5 km")
            print("2. Swargate to Kothrud - 8 km")
            print("3. Hinjawadi to Wakad - 10 km")

            route_choice = input("Enter route choice: ").strip()

            routes = {
                "1": ("Pune Station", "Shivajinagar", 5),
                "2": ("Swargate", "Kothrud", 8),
                "3": ("Hinjawadi", "Wakad", 10)
            }

            if route_choice not in routes:
                print("Invalid route choice!")
                continue

            source, destination, distance = routes[route_choice]
            fare = distance * rate

            print("\n===== BOOKING DETAILS =====")
            print("Cab Type:", cab_type)
            print("Source:", source)
            print("Destination:", destination)
            print("Distance:", distance, "km")
            print("Rate: Rs.", rate, "/km")
            print("Total Fare: Rs.", fare)

            print("\n===== BOOKING CONFIRMATION =====")
            print("1. Confirm & Share OTP")
            print("2. Cancel Ride")

            confirm = input("Enter your choice: ").strip()

            if confirm == "2":
                print("Ride cancelled successfully.")
                print("No OTP has been generated or shared.")

            elif confirm == "1":
                otp = random.randint(1000, 9999)

                print("\n===== BOOKING CONFIRMED =====")
                print("Your OTP is:", otp)
                print("Your ride is now locked.")
                print("Cancellation is NOT allowed after OTP sharing.")

            else:
                print("Invalid confirmation choice!")
                print("No OTP has been shared.")

        elif choice == "2":
            print("Thank you for using Cab Booking Chatbot!")
            print("Goodbye!")
            break

        else:
            print("Invalid menu choice! Please enter 1 or 2.")


cab_booking_chatbot()