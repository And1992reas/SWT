import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class ListElementTest {
    private ListElement le1;
    private ListElement le2;

    @Before
    public void setUp() {
        le1 = new ListElement("content1");
        le2 = new ListElement("content2");
    }

    @Test
    public void testConstructorNullArgument() {
        try {
            new ListElement(null);
            fail("ListElement.ListElement() should throw a NullPointerException if the argument is null!");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testConstructorIllegalArgument() {
        try {
            new ListElement(new String(""));  // new String() catches broken String comparisons
            fail("ListElement.ListElement() should throw an IllegalArgumentException if the argument is empty!");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testConstructorAttributes() {
        assertEquals("The constructor of ListElement should set the content attribute correctly!", "content1",
                le1.getContent());
        assertNull("A new ListElement's next attribute should contain null!", le1.getNext());
        assertEquals("The constructor of ListElement should set the content attribute correctly!", "content2",
                le2.getContent());
        assertNull("A new ListElement's next attribute should contain null!", le2.getNext());
    }

    @Test
    public void testSetContentNullArgument() {
        try {
            le1.setContent(null);
            fail("ListElement.setContent() should throw a NullPointerException if the argument is null!");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testSetEmptyContent() {
        try {
            le1.setContent(new String(""));  // new String() catches broken String comparisons
            fail("ListElement.setContent() should throw an IllegalArgumentException if the argument is empty!");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testGetSetContent() {
        le1.setContent("anystring");
        assertEquals("ListElement.getContent() or ListElement.setContent() does not work properly!", "anystring",
                le1.getContent());
    }

    @Test
    public void testGetSetNext() {
        le1.setNext(le2);
        assertSame("ListElement.getNext() or ListElement.setNext() does not work properly!", le2, le1.getNext());
    }
}
