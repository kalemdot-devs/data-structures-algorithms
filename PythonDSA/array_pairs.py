import sys

largest = sys.float_info.min

class ArrayPairs:
    def printPairs(self, numbers:list[int]):
        pair_count = 0
        for i in range(0, len(numbers)):
            current = numbers[i]
            for j in range(i+1, len(numbers)):
                print(f'({current}, {numbers[j]})', end="")
                pair_count += 1
            print()

        print("total pairs : ", pair_count)
    def main(self):
        numbers = [2, 4, 6, 8,10]
        self.printPairs(numbers)


if __name__ == '__main__':
    sol = ArrayPairs()
    sol.main()

