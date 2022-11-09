package Questions;

public class sparse_Operation {
    
        int MAX = 100;
        int data[][] = new int[MAX][3];
        int row, col;
        int len;
     
        public sparse_Operation(int r, int c)
        {
    
            row = r;
            col = c;
            len = 0;
        }
        public void insert(int r, int c, int val)
        {
     
            if (r > row || c > col) {
                System.out.println("Wrong entry");
            }
     
            else {
    
                data[len][0] = r;
     
                data[len][1] = c;
     
                data[len][2] = val;
     
                len++;
            }
        }
     
        public void add(sparse_Operation b)
        {
     
            if (row != b.row || col != b.col) {
                System.out.println("Matrices can't be added");
            }
     
            else {
     
                int apos = 0, bpos = 0;
                sparse_Operation result = new sparse_Operation(row, col);
     
                while (apos < len && bpos < b.len) {
     
                    if (data[apos][0] > b.data[bpos][0] ||
                      (data[apos][0] == b.data[bpos][0] &&
                       data[apos][1] > b.data[bpos][1]))
     
                    {
     
                        result.insert(b.data[bpos][0],
                                      b.data[bpos][1],
                                      b.data[bpos][2]);
     
                        bpos++;
                    }
     
                    else if (data[apos][0] < b.data[bpos][0] ||
                    (data[apos][0] == b.data[bpos][0] &&
                      data[apos][1] < b.data[bpos][1]))
     
                    {
     
                        result.insert(data[apos][0],
                                      data[apos][1],
                                      data[apos][2]);
     
                        apos++;
                    }
     
                    else {
                        int addedval = data[apos][2] + b.data[bpos][2];
     
                        if (addedval != 0)
                            result.insert(data[apos][0],
                                          data[apos][1],
                                          addedval);
                        apos++;
                        bpos++;
                    }
                }
     
                while (apos < len)
                    result.insert(data[apos][0],
                                  data[apos][1],
                                  data[apos++][2]);
     
                while (bpos < b.len)
                    result.insert(b.data[bpos][0],
                                  b.data[bpos][1],
                                  b.data[bpos++][2]);
     
                result.print();
            }
        }
     
        public sparse_Operation transpose()
        {
     
            sparse_Operation result = new sparse_Operation(col, row);
     
            result.len = len;
     
            int count[] = new int[col + 1];
     
            for (int i = 1; i <= col; i++)
                count[i] = 0;
     
            for (int i = 0; i < len; i++)
                count[data[i][1]]++;
     
            int[] index = new int[col + 1];
     
            index[1] = 0;
    
            for (int i = 2; i <= col; i++)
     
                index[i] = index[i - 1] + count[i - 1];
     
            for (int i = 0; i < len; i++) {
     
                int rpos = index[data[i][1]]++;
     
                result.data[rpos][0] = data[i][1];
     
                result.data[rpos][1] = data[i][0];
     
                result.data[rpos][2] = data[i][2];
            }
    
            return result;
        }
     
        public void multiply(sparse_Operation b)
        {
     
            if (col != b.row) {
     
                System.out.println("Can't multiply, "
                                   + "Invalid dimensions");
     
                return;
            }
     
            b = b.transpose();
            int apos, bpos;
     
            sparse_Operation result = new sparse_Operation(row, b.row);
     
            for (apos = 0; apos < len;) {
     
                int r = data[apos][0];
     
                for (bpos = 0; bpos < b.len;) {
     
                   int c = b.data[bpos][0];
     
                   
                    int tempa = apos;
                    int tempb = bpos;
     
                    int sum = 0;

                    while (tempa < len && data[tempa][0] == r
                           && tempb < b.len && b.data[tempb][0] == c) {
     
                        if (data[tempa][1] < b.data[tempb][1])
     
                            tempa++;
     
                        else if (data[tempa][1] > b.data[tempb][1])
     
                            tempb++;
                        else
     
                            sum += data[tempa++][2] * b.data[tempb++][2];
                    }
     
                    if (sum != 0)
                        result.insert(r, c, sum);
     
                    while (bpos < b.len && b.data[bpos][0] == c)
     
                        bpos++;
                }
     
                while (apos < len && data[apos][0] == r)
     
                    apos++;
            }
     
            result.print();
        }
     
    
        public void print()
        {
      
           for (int i = 0; i < len; i++) {
     
                System.out.println(data[i][0] + " "
                                 + data[i][1] + " " + data[i][2]);
            }
        }
     
        public static void main(String args[])
        {
     
            
            sparse_Operation a = new sparse_Operation(4, 4);
            sparse_Operation b = new sparse_Operation(4, 4);
     
            a.insert(1, 2, 10);
            a.insert(1, 4, 12);
            a.insert(3, 3, 5);
            a.insert(4, 1, 15);
            a.insert(4, 2, 12);
            b.insert(1, 3, 8);
            b.insert(2, 4, 23);
            b.insert(3, 3, 9);
            b.insert(4, 1, 20);
            b.insert(4, 2, 25);
     
           
            System.out.println("Addition: ");
            a.add(b);
            System.out.println("\nMultiplication: ");
            a.multiply(b);
            System.out.println("\nTranspose: ");
            sparse_Operation atranspose = a.transpose();
            atranspose.print();
        }
    }
     

