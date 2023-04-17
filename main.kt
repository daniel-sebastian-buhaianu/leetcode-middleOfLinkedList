fun main() {
    val n1 = ListNode(1)
    val n2 = ListNode(2)
    val n3 = ListNode(3)
    val n4 = ListNode(4)
    val n5 = ListNode(5)
    val n6 = ListNode(6)

    n1.next = n2
    n2.next = n3
    n3.next = n4
    n4.next = n5
    n5.next = n6

    println(middleNode(n1)?.`val`)
}

fun middleNode(head: ListNode?): ListNode? {
    var slowPtr = head
    var fastPtr = head

    while (fastPtr != null && fastPtr.next !=null) {
        slowPtr = slowPtr?.next
        fastPtr = fastPtr.next?.next
    }

    return slowPtr
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}