/* 
 * Copyright 2016 Dmitry Avtonomov.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package umich.ms.fileio.filetypes.pepxml.jaxb.nested;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="analysis_summary" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dataset_derivation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="data_filter" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="parent_file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="windows_parent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="generation_no" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="msms_run_summary" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sample_enzyme">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="specificity" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="sense" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="C"/>
 *                                           &lt;enumeration value="N"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="min_spacing" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
 *                                     &lt;attribute name="cut" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="20"/>
 *                                           &lt;pattern value="[A,C-I,K-N,P-T,VWY]+"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="no_cut">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="0"/>
 *                                           &lt;maxLength value="20"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="fidelity" default="specific">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="specific"/>
 *                                 &lt;enumeration value="semispecific"/>
 *                                 &lt;enumeration value="nonspecific"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="independent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="1" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="search_summary" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="search_database" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="local_path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="database_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="orig_database_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="database_release_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                     &lt;attribute name="database_release_identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="size_in_db_entries" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="size_of_residues" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="type" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="AA"/>
 *                                           &lt;enumeration value="NA"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="enzymatic_search_constraint" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="enzyme" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="max_num_internal_cleavages" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="min_number_termini" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="sequence_search_constraint" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="aminoacid_modification" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="aminoacid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                     &lt;attribute name="variable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="peptide_terminus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="symbol" type="{http://regis-web.systemsbiology.net/pepXML}aa_symbolType" />
 *                                     &lt;attribute name="binary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="terminal_modification" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="terminus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                     &lt;attribute name="variable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="symbol" type="{http://regis-web.systemsbiology.net/pepXML}term_symbolType" />
 *                                     &lt;attribute name="protein_terminus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="base_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="search_engine" use="required" type="{http://regis-web.systemsbiology.net/pepXML}engineType" />
 *                           &lt;attribute name="search_engine_version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="precursor_mass_type" use="required" type="{http://regis-web.systemsbiology.net/pepXML}massType" />
 *                           &lt;attribute name="fragment_mass_type" use="required" type="{http://regis-web.systemsbiology.net/pepXML}massType" />
 *                           &lt;attribute name="out_data_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="out_data" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="search_id" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="analysis_timestamp" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;any processContents='lax' minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="id" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="spectrum_query" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="search_result" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="search_hit" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="alternative_protein" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                                         &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                                         &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="modification_info" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="mod_aminoacid_mass" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                                                   &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="mod_nterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                                         &lt;attribute name="mod_cterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                                         &lt;attribute name="modified_peptide" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="search_score" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="analysis_result" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;any processContents='lax'/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="hit_rank" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *                                               &lt;attribute name="peptide" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="num_tot_proteins" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                               &lt;attribute name="num_matched_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                               &lt;attribute name="tot_num_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                               &lt;attribute name="calc_neutral_pep_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                               &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                               &lt;attribute name="num_missed_cleavages" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="num_matched_peptides" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="is_rejected" default="0">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                                                     &lt;enumeration value="0"/>
 *                                                     &lt;enumeration value="1"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="calc_pI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="search_id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="spectrum" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="start_scan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                           &lt;attribute name="end_scan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                           &lt;attribute name="retention_time_sec" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="collision_energy" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="compensation_voltage" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="precursor_intensity" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="activation_method" type="{http://regis-web.systemsbiology.net/pepXML}activationMethodType" />
 *                           &lt;attribute name="precursor_neutral_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="assumed_charge" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="search_specification" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="index" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="base_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="raw_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="raw_data" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="msManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="msModel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="msIonization" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="msMassAnalyzer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="msDetector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="search_engine" type="{http://regis-web.systemsbiology.net/pepXML}engineType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="summary_xml" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "analysisSummary",
    "datasetDerivation",
    "msmsRunSummary"
})
@XmlRootElement(name = "msms_pipeline_analysis")
public class MsmsPipelineAnalysis {

    @XmlElement(name = "analysis_summary")
    protected List<MsmsPipelineAnalysis.AnalysisSummary> analysisSummary;
    @XmlElement(name = "dataset_derivation")
    protected MsmsPipelineAnalysis.DatasetDerivation datasetDerivation;
    @XmlElement(name = "msms_run_summary", required = true)
    protected List<MsmsPipelineAnalysis.MsmsRunSummary> msmsRunSummary;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "summary_xml", required = true)
    protected String summaryXml;

    /**
     * Gets the value of the analysisSummary property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analysisSummary property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalysisSummary().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MsmsPipelineAnalysis.AnalysisSummary }
     *
     *
     */
    public List<MsmsPipelineAnalysis.AnalysisSummary> getAnalysisSummary() {
        if (analysisSummary == null) {
            analysisSummary = new ArrayList<MsmsPipelineAnalysis.AnalysisSummary>(1);
        }
        return this.analysisSummary;
    }

    /**
     * Gets the value of the datasetDerivation property.
     *
     * @return
     *     possible object is
     *     {@link MsmsPipelineAnalysis.DatasetDerivation }
     *
     */
    public MsmsPipelineAnalysis.DatasetDerivation getDatasetDerivation() {
        return datasetDerivation;
    }

    /**
     * Sets the value of the datasetDerivation property.
     *
     * @param value
     *     allowed object is
     *     {@link MsmsPipelineAnalysis.DatasetDerivation }
     *
     */
    public void setDatasetDerivation(MsmsPipelineAnalysis.DatasetDerivation value) {
        this.datasetDerivation = value;
    }

    /**
     * Gets the value of the msmsRunSummary property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msmsRunSummary property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsmsRunSummary().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MsmsPipelineAnalysis.MsmsRunSummary }
     *
     *
     */
    public List<MsmsPipelineAnalysis.MsmsRunSummary> getMsmsRunSummary() {
        if (msmsRunSummary == null) {
            msmsRunSummary = new ArrayList<MsmsPipelineAnalysis.MsmsRunSummary>(1);
        }
        return this.msmsRunSummary;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the date property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the summaryXml property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSummaryXml() {
        return summaryXml;
    }

    /**
     * Sets the value of the summaryXml property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSummaryXml(String value) {
        this.summaryXml = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any processContents='lax' minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class AnalysisSummary {

        @XmlAnyElement(lax = true)
        protected Object any;
        @XmlAttribute(name = "time", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar time;
        @XmlAttribute(name = "analysis", required = true)
        protected String analysis;
        @XmlAttribute(name = "version")
        protected String version;

        /**
         * Gets the value of the any property.
         *
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         *
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *
         */
        public void setAny(Object value) {
            this.any = value;
        }

        /**
         * Gets the value of the time property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setTime(XMLGregorianCalendar value) {
            this.time = value;
        }

        /**
         * Gets the value of the analysis property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAnalysis() {
            return analysis;
        }

        /**
         * Sets the value of the analysis property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAnalysis(String value) {
            this.analysis = value;
        }

        /**
         * Gets the value of the version property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVersion(String value) {
            this.version = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="data_filter" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="parent_file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="windows_parent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="generation_no" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dataFilter"
    })
    public static class DatasetDerivation {

        @XmlElement(name = "data_filter")
        protected List<MsmsPipelineAnalysis.DatasetDerivation.DataFilter> dataFilter;
        @XmlAttribute(name = "generation_no", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected Integer generationNo;

        /**
         * Gets the value of the dataFilter property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataFilter property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataFilter().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MsmsPipelineAnalysis.DatasetDerivation.DataFilter }
         *
         *
         */
        public List<MsmsPipelineAnalysis.DatasetDerivation.DataFilter> getDataFilter() {
            if (dataFilter == null) {
                dataFilter = new ArrayList<MsmsPipelineAnalysis.DatasetDerivation.DataFilter>(1);
            }
            return this.dataFilter;
        }

        /**
         * Gets the value of the generationNo property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public Integer getGenerationNo() {
            return generationNo;
        }

        /**
         * Sets the value of the generationNo property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setGenerationNo(Integer value) {
            this.generationNo = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="parent_file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="windows_parent" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DataFilter {

            @XmlAttribute(name = "number", required = true)
            @XmlJavaTypeAdapter(Adapter1 .class)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected Integer number;
            @XmlAttribute(name = "parent_file", required = true)
            protected String parentFile;
            @XmlAttribute(name = "windows_parent")
            protected String windowsParent;
            @XmlAttribute(name = "description", required = true)
            protected String description;

            /**
             * Gets the value of the number property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public Integer getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNumber(Integer value) {
                this.number = value;
            }

            /**
             * Gets the value of the parentFile property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getParentFile() {
                return parentFile;
            }

            /**
             * Sets the value of the parentFile property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setParentFile(String value) {
                this.parentFile = value;
            }

            /**
             * Gets the value of the windowsParent property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWindowsParent() {
                return windowsParent;
            }

            /**
             * Sets the value of the windowsParent property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWindowsParent(String value) {
                this.windowsParent = value;
            }

            /**
             * Gets the value of the description property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDescription(String value) {
                this.description = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="sample_enzyme">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="specificity" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="sense" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="C"/>
     *                                 &lt;enumeration value="N"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="min_spacing" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
     *                           &lt;attribute name="cut" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="20"/>
     *                                 &lt;pattern value="[A,C-I,K-N,P-T,VWY]+"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="no_cut">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="0"/>
     *                                 &lt;maxLength value="20"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="fidelity" default="specific">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="specific"/>
     *                       &lt;enumeration value="semispecific"/>
     *                       &lt;enumeration value="nonspecific"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="independent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="1" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="search_summary" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="search_database" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="local_path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="database_name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="orig_database_url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="database_release_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                           &lt;attribute name="database_release_identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="size_in_db_entries" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="size_of_residues" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="type" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="AA"/>
     *                                 &lt;enumeration value="NA"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="enzymatic_search_constraint" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="enzyme" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="max_num_internal_cleavages" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="min_number_termini" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="sequence_search_constraint" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="aminoacid_modification" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="aminoacid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                           &lt;attribute name="variable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="peptide_terminus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="symbol" type="{http://regis-web.systemsbiology.net/pepXML}aa_symbolType" />
     *                           &lt;attribute name="binary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="terminal_modification" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="terminus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                           &lt;attribute name="variable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="symbol" type="{http://regis-web.systemsbiology.net/pepXML}term_symbolType" />
     *                           &lt;attribute name="protein_terminus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="base_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="search_engine" use="required" type="{http://regis-web.systemsbiology.net/pepXML}engineType" />
     *                 &lt;attribute name="search_engine_version" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="precursor_mass_type" use="required" type="{http://regis-web.systemsbiology.net/pepXML}massType" />
     *                 &lt;attribute name="fragment_mass_type" use="required" type="{http://regis-web.systemsbiology.net/pepXML}massType" />
     *                 &lt;attribute name="out_data_type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="out_data" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="search_id" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="analysis_timestamp" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any processContents='lax' minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="id" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="spectrum_query" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="search_result" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="search_hit" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="alternative_protein" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                               &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                               &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="modification_info" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="mod_aminoacid_mass" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                                         &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="mod_nterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                               &lt;attribute name="mod_cterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                               &lt;attribute name="modified_peptide" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="search_score" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="analysis_result" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;any processContents='lax'/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="hit_rank" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
     *                                     &lt;attribute name="peptide" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="num_tot_proteins" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                                     &lt;attribute name="num_matched_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                     &lt;attribute name="tot_num_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                     &lt;attribute name="calc_neutral_pep_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                     &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                     &lt;attribute name="num_missed_cleavages" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="num_matched_peptides" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="is_rejected" default="0">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
     *                                           &lt;enumeration value="0"/>
     *                                           &lt;enumeration value="1"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="calc_pI" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="search_id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="spectrum" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="start_scan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                 &lt;attribute name="end_scan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                 &lt;attribute name="retention_time_sec" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="collision_energy" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="compensation_voltage" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="precursor_intensity" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="activation_method" type="{http://regis-web.systemsbiology.net/pepXML}activationMethodType" />
     *                 &lt;attribute name="precursor_neutral_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="assumed_charge" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="search_specification" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="index" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="base_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="raw_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="raw_data" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="msManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="msModel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="msIonization" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="msMassAnalyzer" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="msDetector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="search_engine" type="{http://regis-web.systemsbiology.net/pepXML}engineType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sampleEnzyme",
        "searchSummary",
        "analysisTimestamp",
        "spectrumQuery"
    })
    public static class MsmsRunSummary {

        @XmlElement(name = "sample_enzyme", required = true)
        protected MsmsPipelineAnalysis.MsmsRunSummary.SampleEnzyme sampleEnzyme;
        @XmlElement(name = "search_summary", required = true)
        protected List<MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary> searchSummary;
        @XmlElement(name = "analysis_timestamp")
        protected List<MsmsPipelineAnalysis.MsmsRunSummary.AnalysisTimestamp> analysisTimestamp;
        @XmlElement(name = "spectrum_query")
        protected List<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery> spectrumQuery;
        @XmlAttribute(name = "base_name", required = true)
        protected String baseName;
        @XmlAttribute(name = "raw_data_type", required = true)
        protected String rawDataType;
        @XmlAttribute(name = "raw_data", required = true)
        protected String rawData;
        @XmlAttribute(name = "msManufacturer")
        protected String msManufacturer;
        @XmlAttribute(name = "msModel")
        protected String msModel;
        @XmlAttribute(name = "msIonization")
        protected String msIonization;
        @XmlAttribute(name = "msMassAnalyzer")
        protected String msMassAnalyzer;
        @XmlAttribute(name = "msDetector")
        protected String msDetector;
        @XmlAttribute(name = "search_engine")
        protected EngineType searchEngine;

        /**
         * Gets the value of the sampleEnzyme property.
         *
         * @return
         *     possible object is
         *     {@link MsmsPipelineAnalysis.MsmsRunSummary.SampleEnzyme }
         *
         */
        public MsmsPipelineAnalysis.MsmsRunSummary.SampleEnzyme getSampleEnzyme() {
            return sampleEnzyme;
        }

        /**
         * Sets the value of the sampleEnzyme property.
         *
         * @param value
         *     allowed object is
         *     {@link MsmsPipelineAnalysis.MsmsRunSummary.SampleEnzyme }
         *
         */
        public void setSampleEnzyme(MsmsPipelineAnalysis.MsmsRunSummary.SampleEnzyme value) {
            this.sampleEnzyme = value;
        }

        /**
         * Gets the value of the searchSummary property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchSummary property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchSummary().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary }
         *
         *
         */
        public List<MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary> getSearchSummary() {
            if (searchSummary == null) {
                searchSummary = new ArrayList<MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary>(1);
            }
            return this.searchSummary;
        }

        /**
         * Gets the value of the analysisTimestamp property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the analysisTimestamp property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnalysisTimestamp().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MsmsPipelineAnalysis.MsmsRunSummary.AnalysisTimestamp }
         *
         *
         */
        public List<MsmsPipelineAnalysis.MsmsRunSummary.AnalysisTimestamp> getAnalysisTimestamp() {
            if (analysisTimestamp == null) {
                analysisTimestamp = new ArrayList<MsmsPipelineAnalysis.MsmsRunSummary.AnalysisTimestamp>(1);
            }
            return this.analysisTimestamp;
        }

        /**
         * Gets the value of the spectrumQuery property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the spectrumQuery property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpectrumQuery().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery }
         *
         *
         */
        public List<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery> getSpectrumQuery() {
            if (spectrumQuery == null) {
                spectrumQuery = new ArrayList<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery>(1);
            }
            return this.spectrumQuery;
        }

        /**
         * Gets the value of the baseName property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBaseName() {
            return baseName;
        }

        /**
         * Sets the value of the baseName property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBaseName(String value) {
            this.baseName = value;
        }

        /**
         * Gets the value of the rawDataType property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRawDataType() {
            return rawDataType;
        }

        /**
         * Sets the value of the rawDataType property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRawDataType(String value) {
            this.rawDataType = value;
        }

        /**
         * Gets the value of the rawData property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRawData() {
            return rawData;
        }

        /**
         * Sets the value of the rawData property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRawData(String value) {
            this.rawData = value;
        }

        /**
         * Gets the value of the msManufacturer property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMsManufacturer() {
            return msManufacturer;
        }

        /**
         * Sets the value of the msManufacturer property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMsManufacturer(String value) {
            this.msManufacturer = value;
        }

        /**
         * Gets the value of the msModel property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMsModel() {
            return msModel;
        }

        /**
         * Sets the value of the msModel property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMsModel(String value) {
            this.msModel = value;
        }

        /**
         * Gets the value of the msIonization property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMsIonization() {
            return msIonization;
        }

        /**
         * Sets the value of the msIonization property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMsIonization(String value) {
            this.msIonization = value;
        }

        /**
         * Gets the value of the msMassAnalyzer property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMsMassAnalyzer() {
            return msMassAnalyzer;
        }

        /**
         * Sets the value of the msMassAnalyzer property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMsMassAnalyzer(String value) {
            this.msMassAnalyzer = value;
        }

        /**
         * Gets the value of the msDetector property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMsDetector() {
            return msDetector;
        }

        /**
         * Sets the value of the msDetector property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMsDetector(String value) {
            this.msDetector = value;
        }

        /**
         * Gets the value of the searchEngine property.
         *
         * @return
         *     possible object is
         *     {@link EngineType }
         *
         */
        public EngineType getSearchEngine() {
            return searchEngine;
        }

        /**
         * Sets the value of the searchEngine property.
         *
         * @param value
         *     allowed object is
         *     {@link EngineType }
         *
         */
        public void setSearchEngine(EngineType value) {
            this.searchEngine = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;any processContents='lax' minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="id" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "any"
        })
        public static class AnalysisTimestamp {

            @XmlAnyElement(lax = true)
            protected Object any;
            @XmlAttribute(name = "time", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar time;
            @XmlAttribute(name = "analysis", required = true)
            protected String analysis;
            @XmlAttribute(name = "id", required = true)
            protected long id;

            /**
             * Gets the value of the any property.
             *
             * @return
             *     possible object is
             *     {@link Element }
             *     {@link Object }
             *
             */
            public Object getAny() {
                return any;
            }

            /**
             * Sets the value of the any property.
             *
             * @param value
             *     allowed object is
             *     {@link Element }
             *     {@link Object }
             *
             */
            public void setAny(Object value) {
                this.any = value;
            }

            /**
             * Gets the value of the time property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setTime(XMLGregorianCalendar value) {
                this.time = value;
            }

            /**
             * Gets the value of the analysis property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAnalysis() {
                return analysis;
            }

            /**
             * Sets the value of the analysis property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAnalysis(String value) {
                this.analysis = value;
            }

            /**
             * Gets the value of the id property.
             *
             */
            public long getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             *
             */
            public void setId(long value) {
                this.id = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="specificity" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="sense" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="C"/>
         *                       &lt;enumeration value="N"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="min_spacing" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
         *                 &lt;attribute name="cut" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="20"/>
         *                       &lt;pattern value="[A,C-I,K-N,P-T,VWY]+"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="no_cut">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="0"/>
         *                       &lt;maxLength value="20"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="name" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="fidelity" default="specific">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="specific"/>
         *             &lt;enumeration value="semispecific"/>
         *             &lt;enumeration value="nonspecific"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="independent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="1" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "specificity"
        })
        public static class SampleEnzyme {

            protected List<MsmsPipelineAnalysis.MsmsRunSummary.SampleEnzyme.Specificity> specificity;
            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "description")
            protected String description;
            @XmlAttribute(name = "fidelity")
            protected String fidelity;
            @XmlAttribute(name = "independent")
            protected Boolean independent;

            /**
             * Gets the value of the specificity property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the specificity property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSpecificity().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MsmsPipelineAnalysis.MsmsRunSummary.SampleEnzyme.Specificity }
             *
             *
             */
            public List<MsmsPipelineAnalysis.MsmsRunSummary.SampleEnzyme.Specificity> getSpecificity() {
                if (specificity == null) {
                    specificity = new ArrayList<MsmsPipelineAnalysis.MsmsRunSummary.SampleEnzyme.Specificity>(1);
                }
                return this.specificity;
            }

            /**
             * Gets the value of the name property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the description property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the fidelity property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFidelity() {
                if (fidelity == null) {
                    return "specific";
                } else {
                    return fidelity;
                }
            }

            /**
             * Sets the value of the fidelity property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFidelity(String value) {
                this.fidelity = value;
            }

            /**
             * Gets the value of the independent property.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public boolean isIndependent() {
                if (independent == null) {
                    return true;
                } else {
                    return independent;
                }
            }

            /**
             * Sets the value of the independent property.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setIndependent(Boolean value) {
                this.independent = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="sense" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="C"/>
             *             &lt;enumeration value="N"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="min_spacing" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
             *       &lt;attribute name="cut" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="20"/>
             *             &lt;pattern value="[A,C-I,K-N,P-T,VWY]+"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="no_cut">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="0"/>
             *             &lt;maxLength value="20"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Specificity {

                @XmlAttribute(name = "sense", required = true)
                protected String sense;
                @XmlAttribute(name = "min_spacing")
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "nonNegativeInteger")
                protected Integer minSpacing;
                @XmlAttribute(name = "cut", required = true)
                protected String cut;
                @XmlAttribute(name = "no_cut")
                protected String noCut;

                /**
                 * Gets the value of the sense property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSense() {
                    return sense;
                }

                /**
                 * Sets the value of the sense property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSense(String value) {
                    this.sense = value;
                }

                /**
                 * Gets the value of the minSpacing property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public int getMinSpacing() {
                    if (minSpacing == null) {
                        return new Adapter1().unmarshal("1");
                    } else {
                        return minSpacing;
                    }
                }

                /**
                 * Sets the value of the minSpacing property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMinSpacing(Integer value) {
                    this.minSpacing = value;
                }

                /**
                 * Gets the value of the cut property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCut() {
                    return cut;
                }

                /**
                 * Sets the value of the cut property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCut(String value) {
                    this.cut = value;
                }

                /**
                 * Gets the value of the noCut property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNoCut() {
                    return noCut;
                }

                /**
                 * Sets the value of the noCut property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNoCut(String value) {
                    this.noCut = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="search_database" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="local_path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="database_name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="orig_database_url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="database_release_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                 &lt;attribute name="database_release_identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="size_in_db_entries" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="size_of_residues" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="type" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="AA"/>
         *                       &lt;enumeration value="NA"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="enzymatic_search_constraint" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="enzyme" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="max_num_internal_cleavages" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="min_number_termini" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="sequence_search_constraint" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="aminoacid_modification" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="aminoacid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                 &lt;attribute name="variable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="peptide_terminus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="symbol" type="{http://regis-web.systemsbiology.net/pepXML}aa_symbolType" />
         *                 &lt;attribute name="binary" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="terminal_modification" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="terminus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                 &lt;attribute name="variable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="symbol" type="{http://regis-web.systemsbiology.net/pepXML}term_symbolType" />
         *                 &lt;attribute name="protein_terminus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="base_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="search_engine" use="required" type="{http://regis-web.systemsbiology.net/pepXML}engineType" />
         *       &lt;attribute name="search_engine_version" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="precursor_mass_type" use="required" type="{http://regis-web.systemsbiology.net/pepXML}massType" />
         *       &lt;attribute name="fragment_mass_type" use="required" type="{http://regis-web.systemsbiology.net/pepXML}massType" />
         *       &lt;attribute name="out_data_type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="out_data" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="search_id" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "searchDatabase",
            "enzymaticSearchConstraint",
            "sequenceSearchConstraint",
            "aminoacidModification",
            "terminalModification",
            "parameter"
        })
        public static class SearchSummary {

            @XmlElement(name = "search_database")
            protected MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.SearchDatabase searchDatabase;
            @XmlElement(name = "enzymatic_search_constraint")
            protected MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.EnzymaticSearchConstraint enzymaticSearchConstraint;
            @XmlElement(name = "sequence_search_constraint")
            protected List<MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.SequenceSearchConstraint> sequenceSearchConstraint;
            @XmlElement(name = "aminoacid_modification")
            protected List<MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.AminoacidModification> aminoacidModification;
            @XmlElement(name = "terminal_modification")
            protected List<MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.TerminalModification> terminalModification;
            protected List<NameValueType> parameter;
            @XmlAttribute(name = "base_name", required = true)
            protected String baseName;
            @XmlAttribute(name = "search_engine", required = true)
            protected EngineType searchEngine;
            @XmlAttribute(name = "search_engine_version")
            protected String searchEngineVersion;
            @XmlAttribute(name = "precursor_mass_type", required = true)
            protected MassType precursorMassType;
            @XmlAttribute(name = "fragment_mass_type", required = true)
            protected MassType fragmentMassType;
            @XmlAttribute(name = "out_data_type")
            protected String outDataType;
            @XmlAttribute(name = "out_data")
            protected String outData;
            @XmlAttribute(name = "search_id", required = true)
            protected long searchId;

            /**
             * Gets the value of the searchDatabase property.
             *
             * @return
             *     possible object is
             *     {@link MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.SearchDatabase }
             *
             */
            public MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.SearchDatabase getSearchDatabase() {
                return searchDatabase;
            }

            /**
             * Sets the value of the searchDatabase property.
             *
             * @param value
             *     allowed object is
             *     {@link MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.SearchDatabase }
             *
             */
            public void setSearchDatabase(MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.SearchDatabase value) {
                this.searchDatabase = value;
            }

            /**
             * Gets the value of the enzymaticSearchConstraint property.
             *
             * @return
             *     possible object is
             *     {@link MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.EnzymaticSearchConstraint }
             *
             */
            public MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.EnzymaticSearchConstraint getEnzymaticSearchConstraint() {
                return enzymaticSearchConstraint;
            }

            /**
             * Sets the value of the enzymaticSearchConstraint property.
             *
             * @param value
             *     allowed object is
             *     {@link MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.EnzymaticSearchConstraint }
             *
             */
            public void setEnzymaticSearchConstraint(MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.EnzymaticSearchConstraint value) {
                this.enzymaticSearchConstraint = value;
            }

            /**
             * Gets the value of the sequenceSearchConstraint property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sequenceSearchConstraint property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSequenceSearchConstraint().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.SequenceSearchConstraint }
             *
             *
             */
            public List<MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.SequenceSearchConstraint> getSequenceSearchConstraint() {
                if (sequenceSearchConstraint == null) {
                    sequenceSearchConstraint = new ArrayList<MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.SequenceSearchConstraint>(1);
                }
                return this.sequenceSearchConstraint;
            }

            /**
             * Gets the value of the aminoacidModification property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the aminoacidModification property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAminoacidModification().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.AminoacidModification }
             *
             *
             */
            public List<MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.AminoacidModification> getAminoacidModification() {
                if (aminoacidModification == null) {
                    aminoacidModification = new ArrayList<MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.AminoacidModification>(1);
                }
                return this.aminoacidModification;
            }

            /**
             * Gets the value of the terminalModification property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the terminalModification property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTerminalModification().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.TerminalModification }
             *
             *
             */
            public List<MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.TerminalModification> getTerminalModification() {
                if (terminalModification == null) {
                    terminalModification = new ArrayList<MsmsPipelineAnalysis.MsmsRunSummary.SearchSummary.TerminalModification>(1);
                }
                return this.terminalModification;
            }

            /**
             * Gets the value of the parameter property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parameter property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParameter().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NameValueType }
             *
             *
             */
            public List<NameValueType> getParameter() {
                if (parameter == null) {
                    parameter = new ArrayList<NameValueType>(1);
                }
                return this.parameter;
            }

            /**
             * Gets the value of the baseName property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBaseName() {
                return baseName;
            }

            /**
             * Sets the value of the baseName property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBaseName(String value) {
                this.baseName = value;
            }

            /**
             * Gets the value of the searchEngine property.
             *
             * @return
             *     possible object is
             *     {@link EngineType }
             *
             */
            public EngineType getSearchEngine() {
                return searchEngine;
            }

            /**
             * Sets the value of the searchEngine property.
             *
             * @param value
             *     allowed object is
             *     {@link EngineType }
             *
             */
            public void setSearchEngine(EngineType value) {
                this.searchEngine = value;
            }

            /**
             * Gets the value of the searchEngineVersion property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSearchEngineVersion() {
                return searchEngineVersion;
            }

            /**
             * Sets the value of the searchEngineVersion property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSearchEngineVersion(String value) {
                this.searchEngineVersion = value;
            }

            /**
             * Gets the value of the precursorMassType property.
             *
             * @return
             *     possible object is
             *     {@link MassType }
             *
             */
            public MassType getPrecursorMassType() {
                return precursorMassType;
            }

            /**
             * Sets the value of the precursorMassType property.
             *
             * @param value
             *     allowed object is
             *     {@link MassType }
             *
             */
            public void setPrecursorMassType(MassType value) {
                this.precursorMassType = value;
            }

            /**
             * Gets the value of the fragmentMassType property.
             *
             * @return
             *     possible object is
             *     {@link MassType }
             *
             */
            public MassType getFragmentMassType() {
                return fragmentMassType;
            }

            /**
             * Sets the value of the fragmentMassType property.
             *
             * @param value
             *     allowed object is
             *     {@link MassType }
             *
             */
            public void setFragmentMassType(MassType value) {
                this.fragmentMassType = value;
            }

            /**
             * Gets the value of the outDataType property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getOutDataType() {
                return outDataType;
            }

            /**
             * Sets the value of the outDataType property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setOutDataType(String value) {
                this.outDataType = value;
            }

            /**
             * Gets the value of the outData property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getOutData() {
                return outData;
            }

            /**
             * Sets the value of the outData property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setOutData(String value) {
                this.outData = value;
            }

            /**
             * Gets the value of the searchId property.
             *
             */
            public long getSearchId() {
                return searchId;
            }

            /**
             * Sets the value of the searchId property.
             *
             */
            public void setSearchId(long value) {
                this.searchId = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="aminoacid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
             *       &lt;attribute name="variable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="peptide_terminus" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="symbol" type="{http://regis-web.systemsbiology.net/pepXML}aa_symbolType" />
             *       &lt;attribute name="binary" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AminoacidModification {

                @XmlAttribute(name = "aminoacid", required = true)
                protected String aminoacid;
                @XmlAttribute(name = "massdiff", required = true)
                protected String massdiff;
                @XmlAttribute(name = "mass", required = true)
                protected float mass;
                @XmlAttribute(name = "variable", required = true)
                protected String variable;
                @XmlAttribute(name = "peptide_terminus")
                protected String peptideTerminus;
                @XmlAttribute(name = "symbol")
                protected String symbol;
                @XmlAttribute(name = "binary")
                protected String binary;
                @XmlAttribute(name = "description")
                protected String description;

                /**
                 * Gets the value of the aminoacid property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getAminoacid() {
                    return aminoacid;
                }

                /**
                 * Sets the value of the aminoacid property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setAminoacid(String value) {
                    this.aminoacid = value;
                }

                /**
                 * Gets the value of the massdiff property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMassdiff() {
                    return massdiff;
                }

                /**
                 * Sets the value of the massdiff property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMassdiff(String value) {
                    this.massdiff = value;
                }

                /**
                 * Gets the value of the mass property.
                 *
                 */
                public float getMass() {
                    return mass;
                }

                /**
                 * Sets the value of the mass property.
                 *
                 */
                public void setMass(float value) {
                    this.mass = value;
                }

                /**
                 * Gets the value of the variable property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getVariable() {
                    return variable;
                }

                /**
                 * Sets the value of the variable property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setVariable(String value) {
                    this.variable = value;
                }

                /**
                 * Gets the value of the peptideTerminus property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getPeptideTerminus() {
                    return peptideTerminus;
                }

                /**
                 * Sets the value of the peptideTerminus property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setPeptideTerminus(String value) {
                    this.peptideTerminus = value;
                }

                /**
                 * Gets the value of the symbol property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSymbol() {
                    return symbol;
                }

                /**
                 * Sets the value of the symbol property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSymbol(String value) {
                    this.symbol = value;
                }

                /**
                 * Gets the value of the binary property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getBinary() {
                    return binary;
                }

                /**
                 * Sets the value of the binary property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setBinary(String value) {
                    this.binary = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="enzyme" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="max_num_internal_cleavages" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="min_number_termini" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class EnzymaticSearchConstraint {

                @XmlAttribute(name = "enzyme", required = true)
                protected String enzyme;
                @XmlAttribute(name = "max_num_internal_cleavages", required = true)
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "nonNegativeInteger")
                protected Integer maxNumInternalCleavages;
                @XmlAttribute(name = "min_number_termini", required = true)
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "nonNegativeInteger")
                protected Integer minNumberTermini;

                /**
                 * Gets the value of the enzyme property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getEnzyme() {
                    return enzyme;
                }

                /**
                 * Sets the value of the enzyme property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setEnzyme(String value) {
                    this.enzyme = value;
                }

                /**
                 * Gets the value of the maxNumInternalCleavages property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public Integer getMaxNumInternalCleavages() {
                    return maxNumInternalCleavages;
                }

                /**
                 * Sets the value of the maxNumInternalCleavages property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMaxNumInternalCleavages(Integer value) {
                    this.maxNumInternalCleavages = value;
                }

                /**
                 * Gets the value of the minNumberTermini property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public Integer getMinNumberTermini() {
                    return minNumberTermini;
                }

                /**
                 * Sets the value of the minNumberTermini property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMinNumberTermini(Integer value) {
                    this.minNumberTermini = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="local_path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="database_name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="orig_database_url" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="database_release_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *       &lt;attribute name="database_release_identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="size_in_db_entries" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="size_of_residues" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="type" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="AA"/>
             *             &lt;enumeration value="NA"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SearchDatabase {

                @XmlAttribute(name = "local_path", required = true)
                protected String localPath;
                @XmlAttribute(name = "URL")
                protected String url;
                @XmlAttribute(name = "database_name")
                protected String databaseName;
                @XmlAttribute(name = "orig_database_url")
                protected String origDatabaseUrl;
                @XmlAttribute(name = "database_release_date")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar databaseReleaseDate;
                @XmlAttribute(name = "database_release_identifier")
                protected String databaseReleaseIdentifier;
                @XmlAttribute(name = "size_in_db_entries")
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "nonNegativeInteger")
                protected Integer sizeInDbEntries;
                @XmlAttribute(name = "size_of_residues")
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "nonNegativeInteger")
                protected Integer sizeOfResidues;
                @XmlAttribute(name = "type", required = true)
                protected String type;

                /**
                 * Gets the value of the localPath property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getLocalPath() {
                    return localPath;
                }

                /**
                 * Sets the value of the localPath property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setLocalPath(String value) {
                    this.localPath = value;
                }

                /**
                 * Gets the value of the url property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getURL() {
                    return url;
                }

                /**
                 * Sets the value of the url property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setURL(String value) {
                    this.url = value;
                }

                /**
                 * Gets the value of the databaseName property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDatabaseName() {
                    return databaseName;
                }

                /**
                 * Sets the value of the databaseName property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDatabaseName(String value) {
                    this.databaseName = value;
                }

                /**
                 * Gets the value of the origDatabaseUrl property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getOrigDatabaseUrl() {
                    return origDatabaseUrl;
                }

                /**
                 * Sets the value of the origDatabaseUrl property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setOrigDatabaseUrl(String value) {
                    this.origDatabaseUrl = value;
                }

                /**
                 * Gets the value of the databaseReleaseDate property.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getDatabaseReleaseDate() {
                    return databaseReleaseDate;
                }

                /**
                 * Sets the value of the databaseReleaseDate property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setDatabaseReleaseDate(XMLGregorianCalendar value) {
                    this.databaseReleaseDate = value;
                }

                /**
                 * Gets the value of the databaseReleaseIdentifier property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDatabaseReleaseIdentifier() {
                    return databaseReleaseIdentifier;
                }

                /**
                 * Sets the value of the databaseReleaseIdentifier property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDatabaseReleaseIdentifier(String value) {
                    this.databaseReleaseIdentifier = value;
                }

                /**
                 * Gets the value of the sizeInDbEntries property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public Integer getSizeInDbEntries() {
                    return sizeInDbEntries;
                }

                /**
                 * Sets the value of the sizeInDbEntries property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSizeInDbEntries(Integer value) {
                    this.sizeInDbEntries = value;
                }

                /**
                 * Gets the value of the sizeOfResidues property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public Integer getSizeOfResidues() {
                    return sizeOfResidues;
                }

                /**
                 * Sets the value of the sizeOfResidues property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSizeOfResidues(Integer value) {
                    this.sizeOfResidues = value;
                }

                /**
                 * Gets the value of the type property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SequenceSearchConstraint {

                @XmlAttribute(name = "sequence", required = true)
                protected String sequence;

                /**
                 * Gets the value of the sequence property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSequence() {
                    return sequence;
                }

                /**
                 * Sets the value of the sequence property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSequence(String value) {
                    this.sequence = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="terminus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
             *       &lt;attribute name="variable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="symbol" type="{http://regis-web.systemsbiology.net/pepXML}term_symbolType" />
             *       &lt;attribute name="protein_terminus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TerminalModification {

                @XmlAttribute(name = "terminus", required = true)
                protected String terminus;
                @XmlAttribute(name = "massdiff", required = true)
                protected String massdiff;
                @XmlAttribute(name = "mass", required = true)
                protected float mass;
                @XmlAttribute(name = "variable", required = true)
                protected String variable;
                @XmlAttribute(name = "symbol")
                protected String symbol;
                @XmlAttribute(name = "protein_terminus", required = true)
                protected String proteinTerminus;
                @XmlAttribute(name = "description")
                protected String description;

                /**
                 * Gets the value of the terminus property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getTerminus() {
                    return terminus;
                }

                /**
                 * Sets the value of the terminus property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setTerminus(String value) {
                    this.terminus = value;
                }

                /**
                 * Gets the value of the massdiff property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMassdiff() {
                    return massdiff;
                }

                /**
                 * Sets the value of the massdiff property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMassdiff(String value) {
                    this.massdiff = value;
                }

                /**
                 * Gets the value of the mass property.
                 *
                 */
                public float getMass() {
                    return mass;
                }

                /**
                 * Sets the value of the mass property.
                 *
                 */
                public void setMass(float value) {
                    this.mass = value;
                }

                /**
                 * Gets the value of the variable property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getVariable() {
                    return variable;
                }

                /**
                 * Sets the value of the variable property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setVariable(String value) {
                    this.variable = value;
                }

                /**
                 * Gets the value of the symbol property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSymbol() {
                    return symbol;
                }

                /**
                 * Sets the value of the symbol property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSymbol(String value) {
                    this.symbol = value;
                }

                /**
                 * Gets the value of the proteinTerminus property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getProteinTerminus() {
                    return proteinTerminus;
                }

                /**
                 * Sets the value of the proteinTerminus property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setProteinTerminus(String value) {
                    this.proteinTerminus = value;
                }

                /**
                 * Gets the value of the description property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="search_result" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="search_hit" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="alternative_protein" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                                     &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                                     &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="modification_info" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="mod_aminoacid_mass" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                                               &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="mod_nterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                                     &lt;attribute name="mod_cterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                                     &lt;attribute name="modified_peptide" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="search_score" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="analysis_result" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;any processContents='lax'/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="hit_rank" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
         *                           &lt;attribute name="peptide" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="num_tot_proteins" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *                           &lt;attribute name="num_matched_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                           &lt;attribute name="tot_num_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                           &lt;attribute name="calc_neutral_pep_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                           &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                           &lt;attribute name="num_missed_cleavages" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="num_matched_peptides" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="is_rejected" default="0">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
         *                                 &lt;enumeration value="0"/>
         *                                 &lt;enumeration value="1"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="calc_pI" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="search_id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="spectrum" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="start_scan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *       &lt;attribute name="end_scan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *       &lt;attribute name="retention_time_sec" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="collision_energy" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="compensation_voltage" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="precursor_intensity" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="activation_method" type="{http://regis-web.systemsbiology.net/pepXML}activationMethodType" />
         *       &lt;attribute name="precursor_neutral_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="assumed_charge" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="search_specification" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="index" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "searchResult"
        })
        public static class SpectrumQuery {

            @XmlElement(name = "search_result")
            protected List<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult> searchResult;
            @XmlAttribute(name = "spectrum", required = true)
            protected String spectrum;
            @XmlAttribute(name = "start_scan", required = true)
            @XmlSchemaType(name = "unsignedInt")
            protected long startScan;
            @XmlAttribute(name = "end_scan", required = true)
            @XmlSchemaType(name = "unsignedInt")
            protected long endScan;
            @XmlAttribute(name = "retention_time_sec")
            protected Float retentionTimeSec;
            @XmlAttribute(name = "collision_energy")
            protected Float collisionEnergy;
            @XmlAttribute(name = "compensation_voltage")
            protected Float compensationVoltage;
            @XmlAttribute(name = "precursor_intensity")
            protected Float precursorIntensity;
            @XmlAttribute(name = "activation_method")
            protected ActivationMethodType activationMethod;
            @XmlAttribute(name = "precursor_neutral_mass", required = true)
            protected float precursorNeutralMass;
            @XmlAttribute(name = "assumed_charge", required = true)
            @XmlJavaTypeAdapter(Adapter1 .class)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected Integer assumedCharge;
            @XmlAttribute(name = "search_specification")
            protected String searchSpecification;
            @XmlAttribute(name = "index", required = true)
            protected long index;

            /**
             * Gets the value of the searchResult property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the searchResult property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSearchResult().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult }
             *
             *
             */
            public List<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult> getSearchResult() {
                if (searchResult == null) {
                    searchResult = new ArrayList<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult>(1);
                }
                return this.searchResult;
            }

            /**
             * Gets the value of the spectrum property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSpectrum() {
                return spectrum;
            }

            /**
             * Sets the value of the spectrum property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSpectrum(String value) {
                this.spectrum = value;
            }

            /**
             * Gets the value of the startScan property.
             *
             */
            public long getStartScan() {
                return startScan;
            }

            /**
             * Sets the value of the startScan property.
             *
             */
            public void setStartScan(long value) {
                this.startScan = value;
            }

            /**
             * Gets the value of the endScan property.
             *
             */
            public long getEndScan() {
                return endScan;
            }

            /**
             * Sets the value of the endScan property.
             *
             */
            public void setEndScan(long value) {
                this.endScan = value;
            }

            /**
             * Gets the value of the retentionTimeSec property.
             *
             * @return
             *     possible object is
             *     {@link Float }
             *
             */
            public Float getRetentionTimeSec() {
                return retentionTimeSec;
            }

            /**
             * Sets the value of the retentionTimeSec property.
             *
             * @param value
             *     allowed object is
             *     {@link Float }
             *
             */
            public void setRetentionTimeSec(Float value) {
                this.retentionTimeSec = value;
            }

            /**
             * Gets the value of the collisionEnergy property.
             *
             * @return
             *     possible object is
             *     {@link Float }
             *
             */
            public Float getCollisionEnergy() {
                return collisionEnergy;
            }

            /**
             * Sets the value of the collisionEnergy property.
             *
             * @param value
             *     allowed object is
             *     {@link Float }
             *
             */
            public void setCollisionEnergy(Float value) {
                this.collisionEnergy = value;
            }

            /**
             * Gets the value of the compensationVoltage property.
             *
             * @return
             *     possible object is
             *     {@link Float }
             *
             */
            public Float getCompensationVoltage() {
                return compensationVoltage;
            }

            /**
             * Sets the value of the compensationVoltage property.
             *
             * @param value
             *     allowed object is
             *     {@link Float }
             *
             */
            public void setCompensationVoltage(Float value) {
                this.compensationVoltage = value;
            }

            /**
             * Gets the value of the precursorIntensity property.
             *
             * @return
             *     possible object is
             *     {@link Float }
             *
             */
            public Float getPrecursorIntensity() {
                return precursorIntensity;
            }

            /**
             * Sets the value of the precursorIntensity property.
             *
             * @param value
             *     allowed object is
             *     {@link Float }
             *
             */
            public void setPrecursorIntensity(Float value) {
                this.precursorIntensity = value;
            }

            /**
             * Gets the value of the activationMethod property.
             *
             * @return
             *     possible object is
             *     {@link ActivationMethodType }
             *
             */
            public ActivationMethodType getActivationMethod() {
                return activationMethod;
            }

            /**
             * Sets the value of the activationMethod property.
             *
             * @param value
             *     allowed object is
             *     {@link ActivationMethodType }
             *
             */
            public void setActivationMethod(ActivationMethodType value) {
                this.activationMethod = value;
            }

            /**
             * Gets the value of the precursorNeutralMass property.
             *
             */
            public float getPrecursorNeutralMass() {
                return precursorNeutralMass;
            }

            /**
             * Sets the value of the precursorNeutralMass property.
             *
             */
            public void setPrecursorNeutralMass(float value) {
                this.precursorNeutralMass = value;
            }

            /**
             * Gets the value of the assumedCharge property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public Integer getAssumedCharge() {
                return assumedCharge;
            }

            /**
             * Sets the value of the assumedCharge property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAssumedCharge(Integer value) {
                this.assumedCharge = value;
            }

            /**
             * Gets the value of the searchSpecification property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSearchSpecification() {
                return searchSpecification;
            }

            /**
             * Sets the value of the searchSpecification property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSearchSpecification(String value) {
                this.searchSpecification = value;
            }

            /**
             * Gets the value of the index property.
             *
             */
            public long getIndex() {
                return index;
            }

            /**
             * Sets the value of the index property.
             *
             */
            public void setIndex(long value) {
                this.index = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="search_hit" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="alternative_protein" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                           &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                           &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="modification_info" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="mod_aminoacid_mass" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                                     &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="mod_nterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                           &lt;attribute name="mod_cterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
             *                           &lt;attribute name="modified_peptide" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="search_score" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="analysis_result" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;any processContents='lax'/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="hit_rank" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
             *                 &lt;attribute name="peptide" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="num_tot_proteins" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
             *                 &lt;attribute name="num_matched_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                 &lt;attribute name="tot_num_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                 &lt;attribute name="calc_neutral_pep_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                 &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                 &lt;attribute name="num_missed_cleavages" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="num_matched_peptides" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="is_rejected" default="0">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
             *                       &lt;enumeration value="0"/>
             *                       &lt;enumeration value="1"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="calc_pI" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="search_id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "searchHit"
            })
            public static class SearchResult {

                @XmlElement(name = "search_hit")
                protected List<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit> searchHit;
                @XmlAttribute(name = "search_id")
                protected Long searchId;

                /**
                 * Gets the value of the searchHit property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the searchHit property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSearchHit().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit }
                 *
                 *
                 */
                public List<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit> getSearchHit() {
                    if (searchHit == null) {
                        searchHit = new ArrayList<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit>(1);
                    }
                    return this.searchHit;
                }

                /**
                 * Gets the value of the searchId property.
                 *
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *
                 */
                public long getSearchId() {
                    if (searchId == null) {
                        return  1L;
                    } else {
                        return searchId;
                    }
                }

                /**
                 * Sets the value of the searchId property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *
                 */
                public void setSearchId(Long value) {
                    this.searchId = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 *
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="alternative_protein" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                 *                 &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *                 &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="modification_info" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="mod_aminoacid_mass" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                 *                           &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="mod_nterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *                 &lt;attribute name="mod_cterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *                 &lt;attribute name="modified_peptide" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="search_score" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="analysis_result" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;any processContents='lax'/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="hit_rank" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
                 *       &lt;attribute name="peptide" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="num_tot_proteins" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
                 *       &lt;attribute name="num_matched_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                 *       &lt;attribute name="tot_num_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                 *       &lt;attribute name="calc_neutral_pep_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *       &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                 *       &lt;attribute name="num_missed_cleavages" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="num_matched_peptides" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="is_rejected" default="0">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
                 *             &lt;enumeration value="0"/>
                 *             &lt;enumeration value="1"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="calc_pI" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "alternativeProtein",
                    "modificationInfo",
                    "searchScore",
                    "analysisResult",
                    "parameter"
                })
                public static class SearchHit {

                    @XmlElement(name = "alternative_protein")
                    protected List<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.AlternativeProtein> alternativeProtein;
                    @XmlElement(name = "modification_info")
                    protected MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.ModificationInfo modificationInfo;
                    @XmlElement(name = "search_score")
                    protected List<NameValueType> searchScore;
                    @XmlElement(name = "analysis_result")
                    protected List<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.AnalysisResult> analysisResult;
                    protected List<NameValueType> parameter;
                    @XmlAttribute(name = "hit_rank", required = true)
                    protected long hitRank;
                    @XmlAttribute(name = "peptide", required = true)
                    protected String peptide;
                    @XmlAttribute(name = "peptide_prev_aa")
                    protected String peptidePrevAa;
                    @XmlAttribute(name = "peptide_next_aa")
                    protected String peptideNextAa;
                    @XmlAttribute(name = "protein", required = true)
                    protected String protein;
                    @XmlAttribute(name = "num_tot_proteins", required = true)
                    @XmlSchemaType(name = "unsignedInt")
                    protected long numTotProteins;
                    @XmlAttribute(name = "num_matched_ions")
                    @XmlJavaTypeAdapter(Adapter1 .class)
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected Integer numMatchedIons;
                    @XmlAttribute(name = "tot_num_ions")
                    @XmlJavaTypeAdapter(Adapter1 .class)
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected Integer totNumIons;
                    @XmlAttribute(name = "calc_neutral_pep_mass", required = true)
                    protected float calcNeutralPepMass;
                    @XmlAttribute(name = "massdiff", required = true)
                    protected String massdiff;
                    @XmlAttribute(name = "num_tol_term")
                    @XmlJavaTypeAdapter(Adapter1 .class)
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected Integer numTolTerm;
                    @XmlAttribute(name = "num_missed_cleavages")
                    @XmlJavaTypeAdapter(Adapter1 .class)
                    @XmlSchemaType(name = "integer")
                    protected Integer numMissedCleavages;
                    @XmlAttribute(name = "num_matched_peptides")
                    @XmlJavaTypeAdapter(Adapter1 .class)
                    @XmlSchemaType(name = "integer")
                    protected Integer numMatchedPeptides;
                    @XmlAttribute(name = "is_rejected")
                    @XmlJavaTypeAdapter(Adapter1 .class)
                    protected Integer isRejected;
                    @XmlAttribute(name = "protein_descr")
                    protected String proteinDescr;
                    @XmlAttribute(name = "calc_pI")
                    protected String calcPI;
                    @XmlAttribute(name = "protein_mw")
                    protected Double proteinMw;

                    /**
                     * Gets the value of the alternativeProtein property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the alternativeProtein property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAlternativeProtein().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.AlternativeProtein }
                     *
                     *
                     */
                    public List<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.AlternativeProtein> getAlternativeProtein() {
                        if (alternativeProtein == null) {
                            alternativeProtein = new ArrayList<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.AlternativeProtein>(1);
                        }
                        return this.alternativeProtein;
                    }

                    /**
                     * Gets the value of the modificationInfo property.
                     *
                     * @return
                     *     possible object is
                     *     {@link MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.ModificationInfo }
                     *
                     */
                    public MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.ModificationInfo getModificationInfo() {
                        return modificationInfo;
                    }

                    /**
                     * Sets the value of the modificationInfo property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.ModificationInfo }
                     *
                     */
                    public void setModificationInfo(MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.ModificationInfo value) {
                        this.modificationInfo = value;
                    }

                    /**
                     * Gets the value of the searchScore property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the searchScore property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSearchScore().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link NameValueType }
                     *
                     *
                     */
                    public List<NameValueType> getSearchScore() {
                        if (searchScore == null) {
                            searchScore = new ArrayList<NameValueType>(1);
                        }
                        return this.searchScore;
                    }

                    /**
                     * Gets the value of the analysisResult property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the analysisResult property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAnalysisResult().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.AnalysisResult }
                     *
                     *
                     */
                    public List<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.AnalysisResult> getAnalysisResult() {
                        if (analysisResult == null) {
                            analysisResult = new ArrayList<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.AnalysisResult>(1);
                        }
                        return this.analysisResult;
                    }

                    /**
                     * Gets the value of the parameter property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the parameter property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getParameter().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link NameValueType }
                     *
                     *
                     */
                    public List<NameValueType> getParameter() {
                        if (parameter == null) {
                            parameter = new ArrayList<NameValueType>(1);
                        }
                        return this.parameter;
                    }

                    /**
                     * Gets the value of the hitRank property.
                     *
                     */
                    public long getHitRank() {
                        return hitRank;
                    }

                    /**
                     * Sets the value of the hitRank property.
                     *
                     */
                    public void setHitRank(long value) {
                        this.hitRank = value;
                    }

                    /**
                     * Gets the value of the peptide property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPeptide() {
                        return peptide;
                    }

                    /**
                     * Sets the value of the peptide property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPeptide(String value) {
                        this.peptide = value;
                    }

                    /**
                     * Gets the value of the peptidePrevAa property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPeptidePrevAa() {
                        return peptidePrevAa;
                    }

                    /**
                     * Sets the value of the peptidePrevAa property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPeptidePrevAa(String value) {
                        this.peptidePrevAa = value;
                    }

                    /**
                     * Gets the value of the peptideNextAa property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPeptideNextAa() {
                        return peptideNextAa;
                    }

                    /**
                     * Sets the value of the peptideNextAa property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPeptideNextAa(String value) {
                        this.peptideNextAa = value;
                    }

                    /**
                     * Gets the value of the protein property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getProtein() {
                        return protein;
                    }

                    /**
                     * Sets the value of the protein property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setProtein(String value) {
                        this.protein = value;
                    }

                    /**
                     * Gets the value of the numTotProteins property.
                     *
                     */
                    public long getNumTotProteins() {
                        return numTotProteins;
                    }

                    /**
                     * Sets the value of the numTotProteins property.
                     *
                     */
                    public void setNumTotProteins(long value) {
                        this.numTotProteins = value;
                    }

                    /**
                     * Gets the value of the numMatchedIons property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public Integer getNumMatchedIons() {
                        return numMatchedIons;
                    }

                    /**
                     * Sets the value of the numMatchedIons property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setNumMatchedIons(Integer value) {
                        this.numMatchedIons = value;
                    }

                    /**
                     * Gets the value of the totNumIons property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public Integer getTotNumIons() {
                        return totNumIons;
                    }

                    /**
                     * Sets the value of the totNumIons property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setTotNumIons(Integer value) {
                        this.totNumIons = value;
                    }

                    /**
                     * Gets the value of the calcNeutralPepMass property.
                     *
                     */
                    public float getCalcNeutralPepMass() {
                        return calcNeutralPepMass;
                    }

                    /**
                     * Sets the value of the calcNeutralPepMass property.
                     *
                     */
                    public void setCalcNeutralPepMass(float value) {
                        this.calcNeutralPepMass = value;
                    }

                    /**
                     * Gets the value of the massdiff property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getMassdiff() {
                        return massdiff;
                    }

                    /**
                     * Sets the value of the massdiff property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setMassdiff(String value) {
                        this.massdiff = value;
                    }

                    /**
                     * Gets the value of the numTolTerm property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public Integer getNumTolTerm() {
                        return numTolTerm;
                    }

                    /**
                     * Sets the value of the numTolTerm property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setNumTolTerm(Integer value) {
                        this.numTolTerm = value;
                    }

                    /**
                     * Gets the value of the numMissedCleavages property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public Integer getNumMissedCleavages() {
                        return numMissedCleavages;
                    }

                    /**
                     * Sets the value of the numMissedCleavages property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setNumMissedCleavages(Integer value) {
                        this.numMissedCleavages = value;
                    }

                    /**
                     * Gets the value of the numMatchedPeptides property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public Integer getNumMatchedPeptides() {
                        return numMatchedPeptides;
                    }

                    /**
                     * Sets the value of the numMatchedPeptides property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setNumMatchedPeptides(Integer value) {
                        this.numMatchedPeptides = value;
                    }

                    /**
                     * Gets the value of the isRejected property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public int getIsRejected() {
                        if (isRejected == null) {
                            return new Adapter1().unmarshal("0");
                        } else {
                            return isRejected;
                        }
                    }

                    /**
                     * Sets the value of the isRejected property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setIsRejected(Integer value) {
                        this.isRejected = value;
                    }

                    /**
                     * Gets the value of the proteinDescr property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getProteinDescr() {
                        return proteinDescr;
                    }

                    /**
                     * Sets the value of the proteinDescr property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setProteinDescr(String value) {
                        this.proteinDescr = value;
                    }

                    /**
                     * Gets the value of the calcPI property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCalcPI() {
                        return calcPI;
                    }

                    /**
                     * Sets the value of the calcPI property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCalcPI(String value) {
                        this.calcPI = value;
                    }

                    /**
                     * Gets the value of the proteinMw property.
                     *
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *
                     */
                    public Double getProteinMw() {
                        return proteinMw;
                    }

                    /**
                     * Sets the value of the proteinMw property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *
                     */
                    public void setProteinMw(Double value) {
                        this.proteinMw = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     *
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                     *       &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
                     *       &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class AlternativeProtein {

                        @XmlAttribute(name = "protein", required = true)
                        protected String protein;
                        @XmlAttribute(name = "protein_descr")
                        protected String proteinDescr;
                        @XmlAttribute(name = "num_tol_term")
                        @XmlJavaTypeAdapter(Adapter1 .class)
                        @XmlSchemaType(name = "nonNegativeInteger")
                        protected Integer numTolTerm;
                        @XmlAttribute(name = "protein_mw")
                        protected Double proteinMw;
                        @XmlAttribute(name = "peptide_prev_aa")
                        protected String peptidePrevAa;
                        @XmlAttribute(name = "peptide_next_aa")
                        protected String peptideNextAa;

                        /**
                         * Gets the value of the protein property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getProtein() {
                            return protein;
                        }

                        /**
                         * Sets the value of the protein property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setProtein(String value) {
                            this.protein = value;
                        }

                        /**
                         * Gets the value of the proteinDescr property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getProteinDescr() {
                            return proteinDescr;
                        }

                        /**
                         * Sets the value of the proteinDescr property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setProteinDescr(String value) {
                            this.proteinDescr = value;
                        }

                        /**
                         * Gets the value of the numTolTerm property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public Integer getNumTolTerm() {
                            return numTolTerm;
                        }

                        /**
                         * Sets the value of the numTolTerm property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setNumTolTerm(Integer value) {
                            this.numTolTerm = value;
                        }

                        /**
                         * Gets the value of the proteinMw property.
                         *
                         * @return
                         *     possible object is
                         *     {@link Double }
                         *
                         */
                        public Double getProteinMw() {
                            return proteinMw;
                        }

                        /**
                         * Sets the value of the proteinMw property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Double }
                         *
                         */
                        public void setProteinMw(Double value) {
                            this.proteinMw = value;
                        }

                        /**
                         * Gets the value of the peptidePrevAa property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getPeptidePrevAa() {
                            return peptidePrevAa;
                        }

                        /**
                         * Sets the value of the peptidePrevAa property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setPeptidePrevAa(String value) {
                            this.peptidePrevAa = value;
                        }

                        /**
                         * Gets the value of the peptideNextAa property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getPeptideNextAa() {
                            return peptideNextAa;
                        }

                        /**
                         * Sets the value of the peptideNextAa property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setPeptideNextAa(String value) {
                            this.peptideNextAa = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     *
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;any processContents='lax'/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "any"
                    })
                    public static class AnalysisResult {

                        @XmlAnyElement(lax = true)
                        protected Object any;
                        @XmlAttribute(name = "analysis", required = true)
                        protected String analysis;
                        @XmlAttribute(name = "id")
                        protected Long id;

                        /**
                         * Gets the value of the any property.
                         *
                         * @return
                         *     possible object is
                         *     {@link Element }
                         *     {@link Object }
                         *
                         */
                        public Object getAny() {
                            return any;
                        }

                        /**
                         * Sets the value of the any property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Element }
                         *     {@link Object }
                         *
                         */
                        public void setAny(Object value) {
                            this.any = value;
                        }

                        /**
                         * Gets the value of the analysis property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getAnalysis() {
                            return analysis;
                        }

                        /**
                         * Sets the value of the analysis property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setAnalysis(String value) {
                            this.analysis = value;
                        }

                        /**
                         * Gets the value of the id property.
                         *
                         * @return
                         *     possible object is
                         *     {@link Long }
                         *
                         */
                        public long getId() {
                            if (id == null) {
                                return  1L;
                            } else {
                                return id;
                            }
                        }

                        /**
                         * Sets the value of the id property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Long }
                         *
                         */
                        public void setId(Long value) {
                            this.id = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     *
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="mod_aminoacid_mass" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                     *                 &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="mod_nterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
                     *       &lt;attribute name="mod_cterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
                     *       &lt;attribute name="modified_peptide" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "modAminoacidMass"
                    })
                    public static class ModificationInfo {

                        @XmlElement(name = "mod_aminoacid_mass")
                        protected List<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.ModificationInfo.ModAminoacidMass> modAminoacidMass;
                        @XmlAttribute(name = "mod_nterm_mass")
                        protected Double modNtermMass;
                        @XmlAttribute(name = "mod_cterm_mass")
                        protected Double modCtermMass;
                        @XmlAttribute(name = "modified_peptide")
                        protected String modifiedPeptide;

                        /**
                         * Gets the value of the modAminoacidMass property.
                         *
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the modAminoacidMass property.
                         *
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getModAminoacidMass().add(newItem);
                         * </pre>
                         *
                         *
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.ModificationInfo.ModAminoacidMass }
                         *
                         *
                         */
                        public List<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.ModificationInfo.ModAminoacidMass> getModAminoacidMass() {
                            if (modAminoacidMass == null) {
                                modAminoacidMass = new ArrayList<MsmsPipelineAnalysis.MsmsRunSummary.SpectrumQuery.SearchResult.SearchHit.ModificationInfo.ModAminoacidMass>(1);
                            }
                            return this.modAminoacidMass;
                        }

                        /**
                         * Gets the value of the modNtermMass property.
                         *
                         * @return
                         *     possible object is
                         *     {@link Double }
                         *
                         */
                        public Double getModNtermMass() {
                            return modNtermMass;
                        }

                        /**
                         * Sets the value of the modNtermMass property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Double }
                         *
                         */
                        public void setModNtermMass(Double value) {
                            this.modNtermMass = value;
                        }

                        /**
                         * Gets the value of the modCtermMass property.
                         *
                         * @return
                         *     possible object is
                         *     {@link Double }
                         *
                         */
                        public Double getModCtermMass() {
                            return modCtermMass;
                        }

                        /**
                         * Sets the value of the modCtermMass property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Double }
                         *
                         */
                        public void setModCtermMass(Double value) {
                            this.modCtermMass = value;
                        }

                        /**
                         * Gets the value of the modifiedPeptide property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getModifiedPeptide() {
                            return modifiedPeptide;
                        }

                        /**
                         * Sets the value of the modifiedPeptide property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setModifiedPeptide(String value) {
                            this.modifiedPeptide = value;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         *
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                         *       &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class ModAminoacidMass {

                            @XmlAttribute(name = "position", required = true)
                            @XmlJavaTypeAdapter(Adapter1 .class)
                            @XmlSchemaType(name = "nonNegativeInteger")
                            protected Integer position;
                            @XmlAttribute(name = "mass", required = true)
                            protected double mass;

                            /**
                             * Gets the value of the position property.
                             *
                             * @return
                             *     possible object is
                             *     {@link String }
                             *
                             */
                            public Integer getPosition() {
                                return position;
                            }

                            /**
                             * Sets the value of the position property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *
                             */
                            public void setPosition(Integer value) {
                                this.position = value;
                            }

                            /**
                             * Gets the value of the mass property.
                             *
                             */
                            public double getMass() {
                                return mass;
                            }

                            /**
                             * Sets the value of the mass property.
                             *
                             */
                            public void setMass(double value) {
                                this.mass = value;
                            }

                        }

                    }

                }

            }

        }

    }

}
