# find & print all sub arrays in a given array

class SubArray:
    def find_print_subarray(self, numbers):
        numbers = [2, 4, 6, 8, 10]
        for i in range(0, len(numbers)):
            for j in range(i, len(numbers)):
                for k in range(i, j+1):
                    print(f'[{numbers[k]}]', end="")
        
                print()
    

    def main(self):
        numbers = [2, 4, 6, 8, 10]
        self.find_print_subarray(numbers)
    

if __name__ == '__main__':
    SubArray().main()
    # print("Hello World")