#include <iostream>
using namespace std;
const int TOTAL_STUDENT = 10;
int main()
{
    // qs3
    // declaration
    string studentName[] = {"Muhamad Husin, A123456",
                            "Nor Asma, A156782",
                            "Raja Kumar, A187623",
                            "Muhamad Ali, A123908",
                            "Ali Shah, A145234",
                            "Nor Nadia, A128734",
                            "Siti Sarah, A120945",
                            "Siti Khadijah, A154237",
                            "Syed Azman, A276456",
                            "Chong Wei, A156278"};
    // opening statement
    cout << "Searching Student's Info" << endl;
    cout << "------------------------------" << endl;
    cout << "enter the name or partial name, \n";
    cout << "you would like to search for: ";

    // input
    string partialName;
    getline(cin, partialName);
    // find length of array
    int length = sizeof(studentName) / sizeof(string);
    // process
    cout << "Search results:" << endl;

    for (int i = 0; i < length; i++)
    {
        if (studentName[i].find(partialName) != string::npos)
        {
            cout << studentName[i] << endl;
        }
    }
    return 0;
}
