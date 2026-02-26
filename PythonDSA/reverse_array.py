class ReverseArraySwaping:
    def reverse_arr(self, numbers:list[int]) -> None:
        first = 0; last = len(numbers) - 1
        while(first<last):
            temp = numbers[last]
            numbers[last] = numbers[first]
            numbers[first] = temp
            first += 1
            last -= 1
    
    def main(self):
        numbers = [2, 4, 6, 8, 10]
        self.reverse_arr(numbers)
        for i in range(len(numbers)):
            print(numbers[i], end=" ")
        print()

if __name__ == '__main__':
    reverse = ReverseArraySwaping()
    reverse.main()