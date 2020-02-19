/* 
 * SaasPro
 *
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = avalara.comms.rest.v2.Client.OpenAPIDateConverter;

namespace avalara.comms.rest.v2.Model
{
    /// <summary>
    /// Tax data for summarized invoice taxes.
    /// </summary>
    [DataContract]
    public partial class SummarizedTax :  IEquatable<SummarizedTax>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SummarizedTax" /> class.
        /// </summary>
        /// <param name="max">max.</param>
        /// <param name="min">min.</param>
        /// <param name="tchg">tchg.</param>
        /// <param name="calc">calc.</param>
        /// <param name="cat">cat.</param>
        /// <param name="cid">cid.</param>
        /// <param name="name">Tax name..</param>
        /// <param name="exm">exm.</param>
        /// <param name="lns">lns.</param>
        /// <param name="pcd">pcd.</param>
        /// <param name="taxpcd">taxpcd.</param>
        /// <param name="rate">Tax rate..</param>
        /// <param name="sur">sur.</param>
        /// <param name="tax">tax.</param>
        /// <param name="lvl">lvl.</param>
        /// <param name="tid">tid.</param>
        /// <param name="usexm">usexm.</param>
        /// <param name="notax">notax.</param>
        /// <param name="trans">trans.</param>
        /// <param name="svc">svc.</param>
        /// <param name="chg">chg.</param>
        public SummarizedTax(double? max = default(double?), double? min = default(double?), double? tchg = default(double?), int? calc = default(int?), string cat = default(string), int? cid = default(int?), string name = default(string), double? exm = default(double?), int? lns = default(int?), int? pcd = default(int?), int? taxpcd = default(int?), double? rate = default(double?), bool? sur = default(bool?), double? tax = default(double?), int? lvl = default(int?), int? tid = default(int?), bool? usexm = default(bool?), bool? notax = default(bool?), int? trans = default(int?), int? svc = default(int?), double? chg = default(double?))
        {
            this.Max = max;
            this.Min = min;
            this.Tchg = tchg;
            this.Calc = calc;
            this.Cat = cat;
            this.Cid = cid;
            this.Name = name;
            this.Exm = exm;
            this.Lns = lns;
            this.Pcd = pcd;
            this.Taxpcd = taxpcd;
            this.Rate = rate;
            this.Sur = sur;
            this.Tax = tax;
            this.Lvl = lvl;
            this.Tid = tid;
            this.Usexm = usexm;
            this.Notax = notax;
            this.Trans = trans;
            this.Svc = svc;
            this.Chg = chg;
            this.Max = max;
            this.Min = min;
            this.Tchg = tchg;
            this.Calc = calc;
            this.Cat = cat;
            this.Cid = cid;
            this.Name = name;
            this.Exm = exm;
            this.Lns = lns;
            this.Pcd = pcd;
            this.Taxpcd = taxpcd;
            this.Rate = rate;
            this.Sur = sur;
            this.Tax = tax;
            this.Lvl = lvl;
            this.Tid = tid;
            this.Usexm = usexm;
            this.Notax = notax;
            this.Trans = trans;
            this.Svc = svc;
            this.Chg = chg;
        }
        
        /// <summary>
        /// Gets or Sets Max
        /// </summary>
        [DataMember(Name="max", EmitDefaultValue=true)]
        public double? Max { get; set; }

        /// <summary>
        /// Gets or Sets Min
        /// </summary>
        [DataMember(Name="min", EmitDefaultValue=true)]
        public double? Min { get; set; }

        /// <summary>
        /// Gets or Sets Tchg
        /// </summary>
        [DataMember(Name="tchg", EmitDefaultValue=true)]
        public double? Tchg { get; set; }

        /// <summary>
        /// Gets or Sets Calc
        /// </summary>
        [DataMember(Name="calc", EmitDefaultValue=true)]
        public int? Calc { get; set; }

        /// <summary>
        /// Gets or Sets Cat
        /// </summary>
        [DataMember(Name="cat", EmitDefaultValue=true)]
        public string Cat { get; set; }

        /// <summary>
        /// Gets or Sets Cid
        /// </summary>
        [DataMember(Name="cid", EmitDefaultValue=true)]
        public int? Cid { get; set; }

        /// <summary>
        /// Tax name.
        /// </summary>
        /// <value>Tax name.</value>
        [DataMember(Name="name", EmitDefaultValue=true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Exm
        /// </summary>
        [DataMember(Name="exm", EmitDefaultValue=true)]
        public double? Exm { get; set; }

        /// <summary>
        /// Gets or Sets Lns
        /// </summary>
        [DataMember(Name="lns", EmitDefaultValue=true)]
        public int? Lns { get; set; }

        /// <summary>
        /// Gets or Sets Pcd
        /// </summary>
        [DataMember(Name="pcd", EmitDefaultValue=true)]
        public int? Pcd { get; set; }

        /// <summary>
        /// Gets or Sets Taxpcd
        /// </summary>
        [DataMember(Name="taxpcd", EmitDefaultValue=true)]
        public int? Taxpcd { get; set; }

        /// <summary>
        /// Tax rate.
        /// </summary>
        /// <value>Tax rate.</value>
        [DataMember(Name="rate", EmitDefaultValue=true)]
        public double? Rate { get; set; }

        /// <summary>
        /// Gets or Sets Sur
        /// </summary>
        [DataMember(Name="sur", EmitDefaultValue=true)]
        public bool? Sur { get; set; }

        /// <summary>
        /// Gets or Sets Tax
        /// </summary>
        [DataMember(Name="tax", EmitDefaultValue=true)]
        public double? Tax { get; set; }

        /// <summary>
        /// Gets or Sets Lvl
        /// </summary>
        [DataMember(Name="lvl", EmitDefaultValue=true)]
        public int? Lvl { get; set; }

        /// <summary>
        /// Gets or Sets Tid
        /// </summary>
        [DataMember(Name="tid", EmitDefaultValue=true)]
        public int? Tid { get; set; }

        /// <summary>
        /// Gets or Sets Usexm
        /// </summary>
        [DataMember(Name="usexm", EmitDefaultValue=true)]
        public bool? Usexm { get; set; }

        /// <summary>
        /// Gets or Sets Notax
        /// </summary>
        [DataMember(Name="notax", EmitDefaultValue=true)]
        public bool? Notax { get; set; }

        /// <summary>
        /// Gets or Sets Trans
        /// </summary>
        [DataMember(Name="trans", EmitDefaultValue=true)]
        public int? Trans { get; set; }

        /// <summary>
        /// Gets or Sets Svc
        /// </summary>
        [DataMember(Name="svc", EmitDefaultValue=true)]
        public int? Svc { get; set; }

        /// <summary>
        /// Gets or Sets Chg
        /// </summary>
        [DataMember(Name="chg", EmitDefaultValue=true)]
        public double? Chg { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SummarizedTax {\n");
            sb.Append("  Max: ").Append(Max).Append("\n");
            sb.Append("  Min: ").Append(Min).Append("\n");
            sb.Append("  Tchg: ").Append(Tchg).Append("\n");
            sb.Append("  Calc: ").Append(Calc).Append("\n");
            sb.Append("  Cat: ").Append(Cat).Append("\n");
            sb.Append("  Cid: ").Append(Cid).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Exm: ").Append(Exm).Append("\n");
            sb.Append("  Lns: ").Append(Lns).Append("\n");
            sb.Append("  Pcd: ").Append(Pcd).Append("\n");
            sb.Append("  Taxpcd: ").Append(Taxpcd).Append("\n");
            sb.Append("  Rate: ").Append(Rate).Append("\n");
            sb.Append("  Sur: ").Append(Sur).Append("\n");
            sb.Append("  Tax: ").Append(Tax).Append("\n");
            sb.Append("  Lvl: ").Append(Lvl).Append("\n");
            sb.Append("  Tid: ").Append(Tid).Append("\n");
            sb.Append("  Usexm: ").Append(Usexm).Append("\n");
            sb.Append("  Notax: ").Append(Notax).Append("\n");
            sb.Append("  Trans: ").Append(Trans).Append("\n");
            sb.Append("  Svc: ").Append(Svc).Append("\n");
            sb.Append("  Chg: ").Append(Chg).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as SummarizedTax);
        }

        /// <summary>
        /// Returns true if SummarizedTax instances are equal
        /// </summary>
        /// <param name="input">Instance of SummarizedTax to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SummarizedTax input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Max == input.Max ||
                    (this.Max != null &&
                    this.Max.Equals(input.Max))
                ) && 
                (
                    this.Min == input.Min ||
                    (this.Min != null &&
                    this.Min.Equals(input.Min))
                ) && 
                (
                    this.Tchg == input.Tchg ||
                    (this.Tchg != null &&
                    this.Tchg.Equals(input.Tchg))
                ) && 
                (
                    this.Calc == input.Calc ||
                    (this.Calc != null &&
                    this.Calc.Equals(input.Calc))
                ) && 
                (
                    this.Cat == input.Cat ||
                    (this.Cat != null &&
                    this.Cat.Equals(input.Cat))
                ) && 
                (
                    this.Cid == input.Cid ||
                    (this.Cid != null &&
                    this.Cid.Equals(input.Cid))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Exm == input.Exm ||
                    (this.Exm != null &&
                    this.Exm.Equals(input.Exm))
                ) && 
                (
                    this.Lns == input.Lns ||
                    (this.Lns != null &&
                    this.Lns.Equals(input.Lns))
                ) && 
                (
                    this.Pcd == input.Pcd ||
                    (this.Pcd != null &&
                    this.Pcd.Equals(input.Pcd))
                ) && 
                (
                    this.Taxpcd == input.Taxpcd ||
                    (this.Taxpcd != null &&
                    this.Taxpcd.Equals(input.Taxpcd))
                ) && 
                (
                    this.Rate == input.Rate ||
                    (this.Rate != null &&
                    this.Rate.Equals(input.Rate))
                ) && 
                (
                    this.Sur == input.Sur ||
                    (this.Sur != null &&
                    this.Sur.Equals(input.Sur))
                ) && 
                (
                    this.Tax == input.Tax ||
                    (this.Tax != null &&
                    this.Tax.Equals(input.Tax))
                ) && 
                (
                    this.Lvl == input.Lvl ||
                    (this.Lvl != null &&
                    this.Lvl.Equals(input.Lvl))
                ) && 
                (
                    this.Tid == input.Tid ||
                    (this.Tid != null &&
                    this.Tid.Equals(input.Tid))
                ) && 
                (
                    this.Usexm == input.Usexm ||
                    (this.Usexm != null &&
                    this.Usexm.Equals(input.Usexm))
                ) && 
                (
                    this.Notax == input.Notax ||
                    (this.Notax != null &&
                    this.Notax.Equals(input.Notax))
                ) && 
                (
                    this.Trans == input.Trans ||
                    (this.Trans != null &&
                    this.Trans.Equals(input.Trans))
                ) && 
                (
                    this.Svc == input.Svc ||
                    (this.Svc != null &&
                    this.Svc.Equals(input.Svc))
                ) && 
                (
                    this.Chg == input.Chg ||
                    (this.Chg != null &&
                    this.Chg.Equals(input.Chg))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Max != null)
                    hashCode = hashCode * 59 + this.Max.GetHashCode();
                if (this.Min != null)
                    hashCode = hashCode * 59 + this.Min.GetHashCode();
                if (this.Tchg != null)
                    hashCode = hashCode * 59 + this.Tchg.GetHashCode();
                if (this.Calc != null)
                    hashCode = hashCode * 59 + this.Calc.GetHashCode();
                if (this.Cat != null)
                    hashCode = hashCode * 59 + this.Cat.GetHashCode();
                if (this.Cid != null)
                    hashCode = hashCode * 59 + this.Cid.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Exm != null)
                    hashCode = hashCode * 59 + this.Exm.GetHashCode();
                if (this.Lns != null)
                    hashCode = hashCode * 59 + this.Lns.GetHashCode();
                if (this.Pcd != null)
                    hashCode = hashCode * 59 + this.Pcd.GetHashCode();
                if (this.Taxpcd != null)
                    hashCode = hashCode * 59 + this.Taxpcd.GetHashCode();
                if (this.Rate != null)
                    hashCode = hashCode * 59 + this.Rate.GetHashCode();
                if (this.Sur != null)
                    hashCode = hashCode * 59 + this.Sur.GetHashCode();
                if (this.Tax != null)
                    hashCode = hashCode * 59 + this.Tax.GetHashCode();
                if (this.Lvl != null)
                    hashCode = hashCode * 59 + this.Lvl.GetHashCode();
                if (this.Tid != null)
                    hashCode = hashCode * 59 + this.Tid.GetHashCode();
                if (this.Usexm != null)
                    hashCode = hashCode * 59 + this.Usexm.GetHashCode();
                if (this.Notax != null)
                    hashCode = hashCode * 59 + this.Notax.GetHashCode();
                if (this.Trans != null)
                    hashCode = hashCode * 59 + this.Trans.GetHashCode();
                if (this.Svc != null)
                    hashCode = hashCode * 59 + this.Svc.GetHashCode();
                if (this.Chg != null)
                    hashCode = hashCode * 59 + this.Chg.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
