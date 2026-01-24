
class Solution:
    def __init__(self) -> None:
        pass

    def hollow_rectangle(self, rows:int, cols:int):
        for i in range(1, rows+1):
            for j in range(1, cols+1):
                # if i == 1 or i == rows or j == 1 or j == cols:
                if (i == 1) | (i == rows) | (j == 1) | (j == cols):
                    print("*", end="")
                else:
                    print(" ", end="")
            
            print()
    
    def main(self):
        self.hollow_rectangle(5, 7)


if __name__ == "__main__":
    solve = Solution()
    solve.main()

