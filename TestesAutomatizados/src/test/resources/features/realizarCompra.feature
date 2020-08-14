Feature: Comprar um produto com sucesso


	Scenario: Compra Com Sucesso.
		
		Given que estou no site 
		When adiciono um produto no carrinho
		And realizo um novo cadastro
		Then efetivo a compra com sucesso
