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
    /// Container class for json properties associated with v2.CalcTaxes request configuration options
    /// </summary>
    [DataContract]
    public partial class RequestConfig :  IEquatable<RequestConfig>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RequestConfig" /> class.
        /// </summary>
        /// <param name="retnb">retnb.</param>
        /// <param name="retext">retext.</param>
        /// <param name="incrf">incrf.</param>
        public RequestConfig(bool? retnb = default(bool?), bool? retext = default(bool?), bool? incrf = default(bool?))
        {
            this.Retnb = retnb;
            this.Retext = retext;
            this.Incrf = incrf;
        }
        
        /// <summary>
        /// Gets or Sets Retnb
        /// </summary>
        [DataMember(Name="retnb", EmitDefaultValue=true)]
        public bool? Retnb { get; set; }

        /// <summary>
        /// Gets or Sets Retext
        /// </summary>
        [DataMember(Name="retext", EmitDefaultValue=true)]
        public bool? Retext { get; set; }

        /// <summary>
        /// Gets or Sets Incrf
        /// </summary>
        [DataMember(Name="incrf", EmitDefaultValue=true)]
        public bool? Incrf { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RequestConfig {\n");
            sb.Append("  Retnb: ").Append(Retnb).Append("\n");
            sb.Append("  Retext: ").Append(Retext).Append("\n");
            sb.Append("  Incrf: ").Append(Incrf).Append("\n");
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
            return this.Equals(input as RequestConfig);
        }

        /// <summary>
        /// Returns true if RequestConfig instances are equal
        /// </summary>
        /// <param name="input">Instance of RequestConfig to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RequestConfig input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Retnb == input.Retnb ||
                    (this.Retnb != null &&
                    this.Retnb.Equals(input.Retnb))
                ) && 
                (
                    this.Retext == input.Retext ||
                    (this.Retext != null &&
                    this.Retext.Equals(input.Retext))
                ) && 
                (
                    this.Incrf == input.Incrf ||
                    (this.Incrf != null &&
                    this.Incrf.Equals(input.Incrf))
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
                if (this.Retnb != null)
                    hashCode = hashCode * 59 + this.Retnb.GetHashCode();
                if (this.Retext != null)
                    hashCode = hashCode * 59 + this.Retext.GetHashCode();
                if (this.Incrf != null)
                    hashCode = hashCode * 59 + this.Incrf.GetHashCode();
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
