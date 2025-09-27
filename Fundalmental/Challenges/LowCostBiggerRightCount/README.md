array a[] - size n

function(array a){
    takes each index of array a
    and counts how many numbers greater than the index there are
    array a vector in positions greater than the index
    return array b
}

function must have O(nlogn)
```java
function int(int[] a){
    int[] b = new int[a.size()]
    
    for (int i = 0; i<a.size(); i++){
        int countAtual = 0;
        
        for (int j = i; i<a.size()){
            
            if (a[j]) > a[i]){
                countAtual++;
            }
        }
    }
}
```