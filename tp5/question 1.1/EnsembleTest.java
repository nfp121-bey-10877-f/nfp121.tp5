package question1;

public class EnsembleTest extends junit.framework.TestCase {

    public void testUnion() {
        question1.Ensemble<Integer> e1, e2;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));

        question1.Ensemble<Integer> union = e1.union(e2);
        assertEquals(3, union.size());
        assertTrue(union.contains(2));
        assertTrue(union.contains(3));
        assertTrue(union.contains(4));
    }

    public void testAdd()
    {
        question1.Ensemble<Integer> e1 = new question1.Ensemble<Integer>();

        assertTrue(e1.add(22));
        assertTrue(e1.add(33));
        assertFalse(e1.add(22));

        assertEquals(2, e1.size());

    }

    public void testInter()
    {
        Ensemble<Integer> e1 = new Ensemble<Integer>();
        assertTrue(e1.add(1));
        assertTrue(e1.add(2));
        assertTrue(e1.add(3));

        Ensemble<Integer> e2 = new Ensemble<>();
        assertTrue(e2.add(2));
        assertTrue(e2.add(3));
        assertTrue(e2.add(4));

        Ensemble<Integer> e3 = e1.inter(e2);

        assertEquals(2, e3.size());
        assertTrue(e3.contains(2));
        assertTrue(e3.contains(3));
        
        assertFalse(e3.contains(1));
        assertFalse(e3.contains(4));

    }
    
    public void testDiff()
    {
        Ensemble<Integer> e1 = new Ensemble<Integer>();
        assertTrue(e1.add(1));
        assertTrue(e1.add(2));
        assertTrue(e1.add(3));

        Ensemble<Integer> e2 = new Ensemble<>();
        assertTrue(e2.add(2));
        assertTrue(e2.add(3));
        assertTrue(e2.add(5));
        
        Ensemble<Integer> e3 = e2.diff(e1);
        assertEquals(1, e3.size());
        
        assertTrue(e3.contains(5));
        assertFalse(e3.contains(1));
        assertFalse(e3.contains(2));
        assertFalse(e3.contains(3));

    }
    
    public void testDiffSym()
    {
        Ensemble<Integer> e1 = new Ensemble<Integer>();
        assertTrue(e1.add(1));
        assertTrue(e1.add(2));
        assertTrue(e1.add(3));

        Ensemble<Integer> e2 = new Ensemble<>();
        assertTrue(e2.add(2));
        assertTrue(e2.add(3));
        assertTrue(e2.add(5));
        
        Ensemble<Integer> e3 = e1.diffSym(e2);
        assertEquals(2, e3.size());
        
        assertTrue(e3.contains(1));
        assertTrue(e3.contains(5));
        
        assertFalse(e3.contains(2));
        assertFalse(e3.contains(3));
        
        
    }
}
