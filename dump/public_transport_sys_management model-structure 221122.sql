-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema public_transport_sys_mng
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `public_transport_sys_mng` ;

-- -----------------------------------------------------
-- Schema public_transport_sys_mng
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `public_transport_sys_mng` DEFAULT CHARACTER SET utf8 ;
USE `public_transport_sys_mng` ;

-- -----------------------------------------------------
-- Table `public_transport_sys_mng`.`bus`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `public_transport_sys_mng`.`bus` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `bus_name` VARCHAR(200) NOT NULL,
  `bus_code` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8mb3;

CREATE UNIQUE INDEX `id_UNIQUE` ON `public_transport_sys_mng`.`bus` (`id` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `public_transport_sys_mng`.`profession`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `public_transport_sys_mng`.`profession` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `professionc` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb3;

CREATE UNIQUE INDEX `id_UNIQUE` ON `public_transport_sys_mng`.`profession` (`id` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `public_transport_sys_mng`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `public_transport_sys_mng`.`employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) NOT NULL,
  `surname` VARCHAR(200) NOT NULL,
  `age` VARCHAR(200) NOT NULL,
  `gender` VARCHAR(200) NOT NULL,
  `email` VARCHAR(200) NOT NULL,
  `profession_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_employee_profession1`
    FOREIGN KEY (`profession_id`)
    REFERENCES `public_transport_sys_mng`.`profession` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 39
DEFAULT CHARACTER SET = utf8mb3;

CREATE INDEX `fk_employee_profession1_idx` ON `public_transport_sys_mng`.`employee` (`profession_id` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `public_transport_sys_mng`.`line`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `public_transport_sys_mng`.`line` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `line_name` VARCHAR(200) NOT NULL,
  `destination` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb3;

CREATE UNIQUE INDEX `id_UNIQUE` ON `public_transport_sys_mng`.`line` (`id` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `public_transport_sys_mng`.`turne`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `public_transport_sys_mng`.`turne` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `turne` VARCHAR(45) NOT NULL,
  `time` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb3;

CREATE UNIQUE INDEX `id_UNIQUE` ON `public_transport_sys_mng`.`turne` (`id` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `public_transport_sys_mng`.`employee_bus_line`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `public_transport_sys_mng`.`employee_bus_line` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `employee_id` INT NULL DEFAULT NULL,
  `bus_id` INT NULL DEFAULT NULL,
  `turn_id` INT NULL DEFAULT NULL,
  `line_id` INT NULL DEFAULT NULL,
  `date` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_bus_id`
    FOREIGN KEY (`bus_id`)
    REFERENCES `public_transport_sys_mng`.`bus` (`id`),
  CONSTRAINT `fk_employee_id`
    FOREIGN KEY (`employee_id`)
    REFERENCES `public_transport_sys_mng`.`employee` (`id`),
  CONSTRAINT `fk_line_id`
    FOREIGN KEY (`line_id`)
    REFERENCES `public_transport_sys_mng`.`line` (`id`),
  CONSTRAINT `fk_turn_id`
    FOREIGN KEY (`turn_id`)
    REFERENCES `public_transport_sys_mng`.`turne` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 25
DEFAULT CHARACTER SET = utf8mb3;

CREATE UNIQUE INDEX `id_UNIQUE` ON `public_transport_sys_mng`.`employee_bus_line` (`id` ASC) VISIBLE;

CREATE INDEX `fk_employee_id_idx` ON `public_transport_sys_mng`.`employee_bus_line` (`employee_id` ASC) VISIBLE;

CREATE INDEX `fk_bus_id_idx` ON `public_transport_sys_mng`.`employee_bus_line` (`bus_id` ASC) VISIBLE;

CREATE INDEX `fk_turn_id_idx` ON `public_transport_sys_mng`.`employee_bus_line` (`turn_id` ASC) VISIBLE;

CREATE INDEX `fk_line_id_idx` ON `public_transport_sys_mng`.`employee_bus_line` (`line_id` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `public_transport_sys_mng`.`position`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `public_transport_sys_mng`.`position` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `position` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb3;

CREATE UNIQUE INDEX `id_UNIQUE` ON `public_transport_sys_mng`.`position` (`id` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `public_transport_sys_mng`.`station_hours`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `public_transport_sys_mng`.`station_hours` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `line_id` INT NOT NULL,
  `position_id` INT NOT NULL,
  `uejl` TIME NULL DEFAULT NULL,
  `molino` TIME NULL DEFAULT NULL,
  `bexhetiKompani` TIME NULL DEFAULT NULL,
  `hitMobilie` TIME NULL DEFAULT NULL,
  `makPetrol` TIME NULL DEFAULT NULL,
  `shipadi` TIME NULL DEFAULT NULL,
  `rotring` TIME NULL DEFAULT NULL,
  ` xhamiaLarme` TIME NULL DEFAULT NULL,
  `gjygji` TIME NULL DEFAULT NULL,
  `fitnesArena` TIME NULL DEFAULT NULL,
  `pallatiKultures` TIME NULL DEFAULT NULL,
  `ronaldo` TIME NULL DEFAULT NULL,
  `veroJambo` TIME NULL DEFAULT NULL,
  `pallmaMall` TIME NULL DEFAULT NULL,
  `stacioniAutobuseve` TIME NULL DEFAULT NULL,
  `xhepçishtRenova` TIME NULL DEFAULT NULL,
  `xhepcishtAlpi` TIME NULL DEFAULT NULL,
  `xhepçishtVenecia` TIME NULL DEFAULT NULL,
  `porojShkolla` TIME NULL DEFAULT NULL,
  `porojIra` TIME NULL DEFAULT NULL,
  `xhamiaDrenovec` TIME NULL DEFAULT NULL,
  `shkolla7marsi` TIME NULL DEFAULT NULL,
  ` çerdhePotok` TIME NULL DEFAULT NULL,
  `shkolla e muzikes` TIME NULL DEFAULT NULL,
  ` embeltoreMostar1` TIME NULL DEFAULT NULL,
  ` mobiljeAntillop` TIME NULL DEFAULT NULL,
  `reçicMadhe` TIME NULL DEFAULT NULL,
  `shkollaPerparimiRM` TIME NULL DEFAULT NULL,
  `varrezatRecicVogël` TIME NULL DEFAULT NULL,
  `rKurtishi` TIME NULL DEFAULT NULL,
  `arabati` TIME NULL DEFAULT NULL,
  `varrezatQytetit` TIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_station_hours_line1`
    FOREIGN KEY (`line_id`)
    REFERENCES `public_transport_sys_mng`.`line` (`id`),
  CONSTRAINT `fk_station_hours_position1`
    FOREIGN KEY (`position_id`)
    REFERENCES `public_transport_sys_mng`.`position` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 26
DEFAULT CHARACTER SET = utf8mb3;

CREATE UNIQUE INDEX `id_UNIQUE` ON `public_transport_sys_mng`.`station_hours` (`id` ASC) VISIBLE;

CREATE INDEX `fk_station_hours_line1_idx` ON `public_transport_sys_mng`.`station_hours` (`line_id` ASC) VISIBLE;

CREATE INDEX `fk_station_hours_position1_idx` ON `public_transport_sys_mng`.`station_hours` (`position_id` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `public_transport_sys_mng`.`raport_controller`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `public_transport_sys_mng`.`raport_controller` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ticket_no` INT NOT NULL,
  `employee_id` INT NOT NULL,
  `bus_destination_line_id` INT NOT NULL,
  `station_hours_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_raport_controller_employee1`
    FOREIGN KEY (`employee_id`)
    REFERENCES `public_transport_sys_mng`.`employee` (`id`),
  CONSTRAINT `fk_raport_controller_station_hours1`
    FOREIGN KEY (`station_hours_id`)
    REFERENCES `public_transport_sys_mng`.`station_hours` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;

CREATE UNIQUE INDEX `id_UNIQUE` ON `public_transport_sys_mng`.`raport_controller` (`id` ASC) VISIBLE;

CREATE INDEX `fk_raport_controller_employee1_idx` ON `public_transport_sys_mng`.`raport_controller` (`employee_id` ASC) VISIBLE;

CREATE INDEX `fk_raport_controller_station_hours1_idx` ON `public_transport_sys_mng`.`raport_controller` (`station_hours_id` ASC) VISIBLE;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
