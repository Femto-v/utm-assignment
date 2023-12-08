#include <iostream>
using namespace std;

void phoneFormat(string &number)
{
    int length = number.size();
    if (length == 11)
    {
        number.insert(0, "+");
        number.insert(4, "-");
        number.insert(9, "-");
    }
}

int main()
{
    string phoneNumber;
    cout << "Enter your phone number -> ";
    getline(cin, phoneNumber);
    if (phoneNumber.length() != 11)
    {
        cout << "Your Handphone Number cant be formatted" << endl;
    }
    else
    {
        phoneFormat(phoneNumber);
        cout << "Your Formatted handphone no. -> " << phoneNumber << endl;
    }

    return 0;
}
