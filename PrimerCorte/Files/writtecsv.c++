#include <string>
#include <fstream>
#include <vector>

void write_csv(std::string filename, std::string colname, std::vector<int> vals){
    // Make a CSV file with one column of integer values
    // filename - the name of the file
    // colname - the name of the one and only column
    // vals - an integer vector of values
    
    // Create an output filestream object
    std::ofstream myFile(filename);
    
    // Send the column name to the stream
    myFile << colname << "\n";
    
    // Send data to the stream
    for(int i = 0; i < vals.size(); ++i)
    {
        myFile << vals.at(i) << "\n";
    }
    
    // Close the file
    myFile.close();
}

int main() {
    // Make a vector of length 100 filled with 1s
    std::vector<int> vec(100, 1);
    
    // Write the vector to CSV
    write_csv("ones.csv", "Col1", vec);
    
    return 0;
}