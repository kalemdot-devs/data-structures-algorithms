import psutil


class ArraysCC:
    # linear search 
    def linear_search(self, numbers:list, key:int):
        for i in range(len(numbers)):
            if numbers[i] == key:
                return i
            
        return -1

    def string_linear_search(self, menu:list, key:str) -> int:
        # loop 
        for i in range(len(menu)):
            if menu[i] == key:
                return i

        return -1

    def main(self):
        # numbers = [2, 4, 8, 6, 10, 12, 14, 18]
        # key = 11
        # indx = self.linear_search(numbers, key)
        # if indx == -1:
        #     print(f"Key not found : {indx}", end="")
        # else:
        #     print(f"key found at index : {indx}", end="")

        menu = ["dosa","samosa","idli", "chole bhtore", "chips"]
        key = "chole bhtore"
        indx = self.string_linear_search(menu, key)
        if indx == -1:
            print(f'key not found in array : {indx}')
        else:
            print(f"key found at index : {indx}")


if __name__ == "__main__":
    arr = ArraysCC()
    arr.main()
