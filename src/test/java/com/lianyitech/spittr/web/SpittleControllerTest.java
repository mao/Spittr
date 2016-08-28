package com.lianyitech.spittr.web;

import com.lianyitech.spittr.data.Spittle;
import com.lianyitech.spittr.data.SpittleRepository;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * Created by daniyyel on 8/24/16.
 */
public class SpittleControllerTest {

    @Test
    public void testGetSpittles() throws Exception {

        List<Spittle> spittles = createSpittles(20);

        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(spittles);

        SpittleController spittleController = new SpittleController(mockRepository);
        MockMvc mockMvc = standaloneSetup(spittleController).setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();

        mockMvc.perform(get("/spittles"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(model().attribute("spittleList", hasItems(spittles.toArray())));
    }

    private List<Spittle> createSpittles(int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle no." + i, new Date()));
        }
        return spittles;
    }
}