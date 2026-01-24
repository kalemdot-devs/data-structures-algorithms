class InvertedHalfParamid:
    def inverted_rotated_half_paramid(self, n:int):
        # outer loop -> number of rows/lines
        for i in range(1, (n+1)):
            # inner loop for number of cols
            for j in range(1, n-i):
                print(" ", end="")
            
            for j in range(1, i):
                print("*", end="")
            # newline
            print()
    
    def main(self):
        self.inverted_rotated_half_paramid(5)
    

if __name__ == '__main__':
    sol = InvertedHalfParamid()
    sol.main()