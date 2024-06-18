package ut.com.example.aitransform;

import org.junit.Test;
import com.example.aitransform.api.MyPluginComponent;
import com.example.aitransform.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}