class rotateImage{
    public void rotate(int[][] matrix) {
        // code to reverse matrix into 90 degree where transpose and reversing of rows of transpose matrix occurs
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<rows;i++){ // transposing a matrix except except diagonal element bcz transpose doesnt affect diagonal elements
            for(int j=i+1;j<cols;j++){// so use i+1 it will not change same element twice
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<rows;i++){ // traverse rows
            int left=0;
            int right=rows-1;
            while(left<right){ // reverse rows
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++; // moving to next element 
                right--; // moving to previous element 
            }
        }
    }
}