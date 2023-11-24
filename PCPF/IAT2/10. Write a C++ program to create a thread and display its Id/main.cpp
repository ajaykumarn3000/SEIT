#include <iostream>
#include <thread>

void displayThreadId() {
    std::thread::id this_id = std::this_thread::get_id();
    std::cout << "Thread ID: " << this_id << std::endl;
}

int main() {
    std::thread myThread(displayThreadId);

    // Wait for the thread to finish
    myThread.join();

    std::cout << "Main thread ID: " << std::this_thread::get_id() << std::endl;
    
    return 0;
}
