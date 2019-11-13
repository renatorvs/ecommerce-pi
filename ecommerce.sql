-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13-Nov-2019 às 05:45
-- Versão do servidor: 10.4.8-MariaDB
-- versão do PHP: 7.2.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `ecommerce`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carrinho`
--

CREATE TABLE `carrinho` (
  `carr_id` int(11) NOT NULL,
  `carr_subtotal` decimal(10,2) DEFAULT NULL,
  `car_descri` varchar(50) DEFAULT NULL,
  `ender_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `carrinho_livro`
--

CREATE TABLE `carrinho_livro` (
  `licar_id` int(11) NOT NULL,
  `licar_data` datetime DEFAULT NULL,
  `liv_Id` int(11) DEFAULT NULL,
  `carr_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria`
--

CREATE TABLE `categoria` (
  `cat_id` int(11) NOT NULL,
  `cat_nome` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `categoria`
--

INSERT INTO `categoria` (`cat_id`, `cat_nome`) VALUES
(1, 'de 1 a 2 anos'),
(2, ' de 3 a 4 anos'),
(3, ' de 4 a 8 anos '),
(4, 'de 8 a 9 anos');

-- --------------------------------------------------------

--
-- Estrutura da tabela `ebook`
--

CREATE TABLE `ebook` (
  `livebook_id` int(11) NOT NULL,
  `liebook_halterMark` varchar(50) DEFAULT NULL,
  `liv_Id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `endereco`
--

CREATE TABLE `endereco` (
  `ender_id` int(11) NOT NULL,
  `ender_cep` varchar(50) DEFAULT NULL,
  `ender_comple` varchar(50) DEFAULT NULL,
  `ender_numero` varchar(50) NOT NULL,
  `ender_logradouro` varchar(50) NOT NULL,
  `ender_bairro` varchar(50) NOT NULL,
  `ender_cidade` varchar(50) NOT NULL,
  `ender_estado` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `endereco`
--

INSERT INTO `endereco` (`ender_id`, `ender_cep`, `ender_comple`, `ender_numero`, `ender_logradouro`, `ender_bairro`, `ender_cidade`, `ender_estado`) VALUES
(2, NULL, 'Casa 02', '105', 'Rua Jão XI', 'jardins', 'São paulo', 'SP');

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro`
--

CREATE TABLE `livro` (
  `liv_Id` int(11) NOT NULL,
  `liv_titulo` varchar(50) NOT NULL DEFAULT 'NULL',
  `liv_autor` varchar(50) DEFAULT NULL,
  `liv_editora` varchar(50) DEFAULT NULL,
  `liv_ano` datetime DEFAULT NULL,
  `liv_descricao` varchar(50) DEFAULT NULL,
  `liv_preco` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `livro`
--

INSERT INTO `livro` (`liv_Id`, `liv_titulo`, `liv_autor`, `liv_editora`, `liv_ano`, `liv_descricao`, `liv_preco`) VALUES
(1, 'O coelho e a raposa', NULL, NULL, NULL, NULL, 50),
(2, 'Branca de neve', NULL, NULL, NULL, NULL, 40);

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro_fisico`
--

CREATE TABLE `livro_fisico` (
  `livfisi_id` int(11) NOT NULL,
  `livfisi_estoque` int(11) DEFAULT NULL,
  `livfisi_isbn` int(11) DEFAULT NULL,
  `liv_Id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pagamento`
--

CREATE TABLE `pagamento` (
  `pag_id` int(11) NOT NULL,
  `pag_nome_titular` varchar(50) DEFAULT NULL,
  `pag_card_numero` varchar(50) NOT NULL,
  `pag_cod_seguranca` varchar(50) NOT NULL,
  `pag_data_venci` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pagamento`
--

INSERT INTO `pagamento` (`pag_id`, `pag_nome_titular`, `pag_card_numero`, `pag_cod_seguranca`, `pag_data_venci`) VALUES
(1, 'Renato vieira', '100200', '105', '05/outubro');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE `pedido` (
  `pedi_id` int(11) NOT NULL,
  `pe_notafiscal` int(11) DEFAULT NULL,
  `pedi_valortotal` decimal(10,2) DEFAULT NULL,
  `pe_data` datetime DEFAULT NULL,
  `pedistatus_id` int(11) DEFAULT NULL,
  `carr_id` int(11) DEFAULT NULL,
  `pag_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido_status`
--

CREATE TABLE `pedido_status` (
  `pedistatus_id` int(11) NOT NULL,
  `pedistatus_nome` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoafisica`
--

CREATE TABLE `pessoafisica` (
  `pf_id` int(11) NOT NULL,
  `pf_cpf` varchar(50) NOT NULL,
  `pf_email` varchar(50) NOT NULL,
  `pf_nome` varchar(50) NOT NULL,
  `pf_sobrenome` varchar(50) NOT NULL,
  `pf_senha` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pessoafisica`
--

INSERT INTO `pessoafisica` (`pf_id`, `pf_cpf`, `pf_email`, `pf_nome`, `pf_sobrenome`, `pf_senha`) VALUES
(1, '42435110022', 'Renato@gmail.com', 'Renato', 'Vieira', '1426');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoajuridica`
--

CREATE TABLE `pessoajuridica` (
  `pj_cnpj` int(11) NOT NULL,
  `pj_NomeFantasia` varchar(50) DEFAULT NULL,
  `pj_RazaoSocial` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `carrinho`
--
ALTER TABLE `carrinho`
  ADD PRIMARY KEY (`carr_id`),
  ADD KEY `ender_id` (`ender_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Índices para tabela `carrinho_livro`
--
ALTER TABLE `carrinho_livro`
  ADD PRIMARY KEY (`licar_id`),
  ADD KEY `liv_Id` (`liv_Id`);

--
-- Índices para tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`cat_id`);

--
-- Índices para tabela `ebook`
--
ALTER TABLE `ebook`
  ADD PRIMARY KEY (`livebook_id`),
  ADD KEY `liv_Id` (`liv_Id`);

--
-- Índices para tabela `endereco`
--
ALTER TABLE `endereco`
  ADD PRIMARY KEY (`ender_id`);

--
-- Índices para tabela `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`liv_Id`);

--
-- Índices para tabela `livro_fisico`
--
ALTER TABLE `livro_fisico`
  ADD PRIMARY KEY (`livfisi_id`),
  ADD KEY `liv_Id` (`liv_Id`);

--
-- Índices para tabela `pagamento`
--
ALTER TABLE `pagamento`
  ADD PRIMARY KEY (`pag_id`);

--
-- Índices para tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`pedi_id`);

--
-- Índices para tabela `pedido_status`
--
ALTER TABLE `pedido_status`
  ADD PRIMARY KEY (`pedistatus_id`);

--
-- Índices para tabela `pessoafisica`
--
ALTER TABLE `pessoafisica`
  ADD PRIMARY KEY (`pf_id`);

--
-- Índices para tabela `pessoajuridica`
--
ALTER TABLE `pessoajuridica`
  ADD PRIMARY KEY (`pj_cnpj`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `endereco`
--
ALTER TABLE `endereco`
  MODIFY `ender_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `livro`
--
ALTER TABLE `livro`
  MODIFY `liv_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `pagamento`
--
ALTER TABLE `pagamento`
  MODIFY `pag_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `pessoafisica`
--
ALTER TABLE `pessoafisica`
  MODIFY `pf_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `carrinho`
--
ALTER TABLE `carrinho`
  ADD CONSTRAINT `carrinho_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `usuario` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
