package Questions;

public class addSparse {
    int MAX = 100;
 
    // Array representation
    // of sparse matrix
    //[][0] represents row
    //[][1] represents col
    //[][2] represents value
    int data[][] = new int[MAX][3];
 
    // dimensions of matrix
    int row, col;
 
    // total number of elements in matrix
    int len;
 
    public addSparse(int r, int c)
    {
 
        // initialize row
        row = r;
 
        // initialize col
        col = c;
 
        // initialize length to 0
        len = 0;
    }
 
    // insert elements into sparse matrix
    public void insert(int r, int c, int val)
    {
 
        // invalid entry
        if (r > row || c > col) {
            System.out.println("Wrong entry");
        }
 
        else {
 
            // insert row value
            data[len][0] = r;
 
            // insert col value
            data[len][1] = c;
 
            // insert element's value
            data[len][2] = val;
 
            // increment number of data in matrix
            len++;
        }
    }
 
    public void add(addSparse b)
    {
 
        // if matrices don't have same dimensions
        if (row != b.row || col != b.col) {
            System.out.println("Matrices can't be added");
        }
 
        else {
 
            int apos = 0, bpos = 0;
            addSparse result = new addSparse(row, col);
 
            while (apos < len && bpos < b.len) {
 
                // if b's row and col is smaller
                if (data[apos][0] > b.data[bpos][0] ||
                  (data[apos][0] == b.data[bpos][0] &&
                   data[apos][1] > b.data[bpos][1]))
 
                {
 
                    // insert smaller value into result
                    result.insert(b.data[bpos][0],
                                  b.data[bpos][1],
                                  b.data[bpos][2]);
 
                    bpos++;
                }
 
                // if a's row and col is smaller
                else if (data[apos][0] < b.data[bpos][0] ||
                (data[apos][0] == b.data[bpos][0] &&
                  data[apos][1] < b.data[bpos][1]))
 
                {
 
                    // insert smaller value into result
                    result.insert(data[apos][0],
                                  data[apos][1],
                                  data[apos][2]);
 
                    apos++;
                }
 
                else {
 
                    // add the values as row and col is same
                    int addedval = data[apos][2] + b.data[bpos][2];
 
                    if (addedval != 0)
                        result.insert(data[apos][0],
                                      data[apos][1],
                                      addedval);
                    // then insert
                    apos++;
                    bpos++;
                }
            }
 
            // insert remaining elements
            while (apos < len)
                result.insert(data[apos][0],
                              data[apos][1],
                              data[apos++][2]);
 
            while (bpos < b.len)
                result.insert(b.data[bpos][0],
                              b.data[bpos][1],
                              b.data[bpos++][2]);
 
            // print result
            result.print();
        }
    }
    public void print()
    {
        System.out.println("Dimension: " + row + "x" + col);
        System.out.println("Sparse Matrix: \nRow Column Value");
 
        for (int i = 0; i < len; i++) {
 
            System.out.println(data[i][0] + " "
                             + data[i][1] + " " + data[i][2]);
        }
    }
    public static void main(String[] args) {
        addSparse a = new addSparse(3,3);
        addSparse b = new addSparse(3,3);

        a.insert(1,2,3);
        a.insert(1,2,4);
        a.insert(2,3,1);
        b.insert(1,1,1);
        b.insert(2,2,2);
        b.insert(1,2,1);
       a.add(b);
    }
}
