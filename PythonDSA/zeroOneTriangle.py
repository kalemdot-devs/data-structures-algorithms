class ZeroOneTriangle:
    def zero_one_triangle(self,n:int):
        for i in range(1, n+1):
            for j in range(1, i+1):
                if (i+j) % 2 == 0:
                    print("1 ", end="")
                else:
                    print("0 ", end="")
            
            print()
    
    def main(self):
        self.zero_one_triangle(5)


if __name__ == "__main__":
    zero_one = ZeroOneTriangle()
    zero_one.main()