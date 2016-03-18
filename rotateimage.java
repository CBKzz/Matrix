 public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n/2;i++){
            int bottom=n-i-1;
	    	for(int j=i;j<n-i-1;j++){
	    	    int offset=j-i;
	    	    int temp=matrix[i][j];
	    	    matrix[i][j]=matrix[bottom-offset][i];
	    	    matrix[bottom-offset][i]=matrix[bottom][bottom-offset];
	    	    matrix[bottom][bottom-offset]=matrix[j][bottom];
	    	    matrix[j][bottom]=temp;
	    	}	
	    }
    }
