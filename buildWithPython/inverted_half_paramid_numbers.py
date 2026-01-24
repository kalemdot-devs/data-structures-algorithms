class InvertedHalfParamidWithNumbers:
    def inverted_half_paramid_withNumbers(self, n:int):
        # outter loop -> lines/rows
        for i in range(1, n+1):
            # inner loop -> cols
            for j in range(1, n-i+2):
                print(j, end='')
            print()
        
    def main(self):
        self.inverted_half_paramid_withNumbers(5)


if __name__ == '__main__':
    sol = InvertedHalfParamidWithNumbers()
    sol.main()