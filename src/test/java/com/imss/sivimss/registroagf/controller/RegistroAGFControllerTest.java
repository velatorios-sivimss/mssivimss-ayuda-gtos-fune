package com.imss.sivimss.registroagf.controller;

import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.mockserver.model.HttpStatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.imss.sivimss.registroagf.base.BaseTest;
import com.imss.sivimss.registroagf.client.MockModCatalogosClient;
import com.imss.sivimss.registroagf.security.jwt.JwtTokenProvider;
import com.imss.sivimss.registroagf.util.JsonUtil;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureMockMvc
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@WithMockUser(username="10796223", password="123456",roles = "ADMIN")
public class RegistroAGFControllerTest extends BaseTest {
	 @Autowired
	 private JwtTokenProvider jwtTokenProvider;

	 @BeforeEach
	 public void setup() {
	    this.mockMvc = MockMvcBuilders
	                .webAppContextSetup(this.context)
	                .apply(springSecurity())
	                .build();
	 }
	 
	 @Test
	 @DisplayName("detalle")
	 @Order(1)
	 public void detalle() throws Exception {
	       Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	       String myToken = jwtTokenProvider.createToken(authentication.getPrincipal().toString());
	       MockModCatalogosClient.detalle(HttpStatusCode.OK_200, JsonUtil.readFromJson("json/request/detalle_finado_mock.json"), JsonUtil.readFromJson("json/response/response_detalle_finado_.json"), myToken, mockServer);
	       this.mockMvc.perform(post("/registroagf/detalle")
	                    .contentType(MediaType.APPLICATION_JSON)
	                    .accept(MediaType.APPLICATION_JSON)
	                    .header("Authorization","Bearer " + myToken)
	                    .content(JsonUtil.readFromJson("json/request/detalle_finado_controller.json"))
	                    .with(csrf()))
	                .andDo(print())
	                .andExpect(status().isOk());
	 }
	 
	 @Test
	 @DisplayName("lista ramos")
	 @Order(2)
	 public void listaRamos() throws Exception {
	       Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	       String myToken = jwtTokenProvider.createToken(authentication.getPrincipal().toString());
	       MockModCatalogosClient.listaRamos(HttpStatusCode.OK_200, JsonUtil.readFromJson("json/request/lista_ramos_mock.json"), JsonUtil.readFromJson("json/response/response_lista_ramos.json"), myToken, mockServer);
	       this.mockMvc.perform(post("/registroagf/lista-ramos")
	                    .contentType(MediaType.APPLICATION_JSON)
	                    .accept(MediaType.APPLICATION_JSON)
	                    .header("Authorization","Bearer " + myToken)
	                    .content(JsonUtil.readFromJson("json/request/lista_ramos_controller.json"))
	                    .with(csrf()))
	                .andDo(print())
	                .andExpect(status().isOk());
	 }
	 
	 @Test
	 @DisplayName("lista tipos id")
	 @Order(3)
	 public void listaTiposId() throws Exception {
	       Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	       String myToken = jwtTokenProvider.createToken(authentication.getPrincipal().toString());
	       MockModCatalogosClient.detalle(HttpStatusCode.OK_200, JsonUtil.readFromJson("json/request/lista_ids_mock.json"), JsonUtil.readFromJson("json/response/response_lista_ids.json"), myToken, mockServer);
	       this.mockMvc.perform(post("/registroagf/lista-ids")
	                    .contentType(MediaType.APPLICATION_JSON)
	                    .accept(MediaType.APPLICATION_JSON)
	                    .header("Authorization","Bearer " + myToken)
	                    .content(JsonUtil.readFromJson("json/request/lista_ids_controller.json"))
	                    .with(csrf()))
	                .andDo(print())
	                .andExpect(status().isOk());
	 }
	 
	 @Test
	 @DisplayName("guardar")
	 @Order(4)
	 public void guardar() throws Exception {
	       Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	       String myToken = jwtTokenProvider.createToken(authentication.getPrincipal().toString());
	       MockModCatalogosClient.guardar(HttpStatusCode.OK_200, JsonUtil.readFromJson("json/request/guardar_agf_mock.json"), JsonUtil.readFromJson("json/response/response_guardar_agf.json"), myToken, mockServer);
	       this.mockMvc.perform(post("/registroagf/guardar")
	                    .contentType(MediaType.APPLICATION_JSON)
	                    .accept(MediaType.APPLICATION_JSON)
	                    .header("Authorization","Bearer " + myToken)
	                    .content(JsonUtil.readFromJson("json/request/guardar_agf_controller.json"))
	                    .with(csrf()))
	                .andDo(print())
	                .andExpect(status().isOk());
	 }
	 
}
