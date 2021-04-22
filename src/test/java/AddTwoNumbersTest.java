import addtwonumbersproblem.AddTwoNumbers;
import addtwonumbersproblem.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AddTwoNumbersTest {

    private AddTwoNumbers sut;

    @Test // 243+544 = 708
    public void testCase1() {
        ListNode list1 = createNode(2, createNode(4, createNode(3, null)));
        ListNode list2 = createNode(5, createNode(6, createNode(4, null)));
        sut = new AddTwoNumbers();
        ListNode result = sut.solution(list1, list2);
        assertEquals(7, result.getVal());
        result = result.getNext();
        assertEquals(0, result.getVal());
        result = result.getNext();
        assertEquals(8, result.getVal());
        result = result.getNext();
        assertNull(result);
    }

    @Test // 9999999+9999 = 89990001
    public void testCase2() {
        ListNode list1 = createNode(9, createNode(9, createNode(9, createNode(9, createNode(9, createNode(9, createNode(9, null)))))));
        ListNode list2 = createNode(9, createNode(9, createNode(9, createNode(9, null))));
        sut = new AddTwoNumbers();
        ListNode result = sut.solution(list1, list2);
        assertEquals(8, result.getVal());
        result = result.getNext();
        assertEquals(9, result.getVal());
        result = result.getNext();
        assertEquals(9, result.getVal());
        result = result.getNext();
        assertEquals(9, result.getVal());
        result = result.getNext();
        assertEquals(0, result.getVal());
        result = result.getNext();
        assertEquals(0, result.getVal());
        result = result.getNext();
        assertEquals(0, result.getVal());
        result = result.getNext();
        assertEquals(1, result.getVal());
        result = result.getNext();
        assertNull(result);
    }

    @Test
    public void testCase3() {
        ListNode list1 = createNode(0, null);
        ListNode list2 = createNode(0, null);
        sut = new AddTwoNumbers();
        ListNode result = sut.solution(list1, list2);
        assertEquals(0, result.getVal());
        result = result.getNext();
        assertNull(result);
    }

    private ListNode createNode(int value, ListNode next) {
        return new ListNode(value, next);
    }

}