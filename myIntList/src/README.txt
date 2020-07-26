MyIntArrayList class representing an ArrayList of integers.
@null null entry invalid

It has methods:
    add(value), remove(value), findByValue(value), findByIndex(index), minElement(), maxElement(),
    int[] indicesOfTotalElements(int sum), int[] duplicateСontent().

Description of methods:

/**
        * Appends the specified element to the end of this list, and all element's of this list
        * will be increased by the value of this item
        *
        * @param   element to be appended to this list
        */
public void add(int element) { }

/**
     * Removes the element at this list and all element's of this list will be reduced by the value of this item.
     *
     * @param value the value of the element to be removed
     * @throws IndexOutOfBoundsException if the value is absent
     */
public void remove(int element) {}

/**
     * Find the index of an item by value
     *
     * @param value the value of the element to be find its index
     * @throws IndexOutOfBoundsException if the value is absent
     */
public int findByValue(int value) {}

/**
     * Find the element of an item by index
     *
     * @param index the index of the element to be find
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
     */
public int findByIndex(int index) {}

/**
// *     Returns a min element's of the list
*/
public int minElement() {}

/**
// *     Returns a max element's of the list
*/
public int maxElement() {}

/**
// *    Returns an array of indices of numbers the sum of which is equal to the input value
//      @param value sum is value of the sum of two elements of the array whose indices must be found
*/
public int[] indicesOfTotalElements(int sum){}

/**
// *     Returns an array of result[]  where (result[0]) is the number that repeats (result[1]) times
*/
    public int[] duplicateСontent() {}