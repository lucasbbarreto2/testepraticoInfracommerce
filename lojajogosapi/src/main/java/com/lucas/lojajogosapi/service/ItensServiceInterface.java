package com.lucas.lojajogosapi.service;

import java.util.List;

import com.lucas.lojajogosapi.domain.Item;

public interface ItensServiceInterface {
	Item insereNoCarrinho(Long jogo_id, Long user_id, Long quant);
	void deletaDoCarrinho(Long jogo_id, Long user_id);
	List<Item> listarItensCarrinho(Long carrinho_id);
}
